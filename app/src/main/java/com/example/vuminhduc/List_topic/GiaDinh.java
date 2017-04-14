package com.example.vuminhduc.List_topic;

/**
 * Created by vuminhduc on 29/03/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.vuminhduc.ItemStory;
import com.example.vuminhduc.baseAdapter;
import com.example.vuminhduc.story.MainActivity;
import com.example.vuminhduc.story.R;

import java.util.ArrayList;
import java.util.List;

public class GiaDinh extends AppCompatActivity implements AdapterView.OnItemClickListener,
        baseAdapter.Itemstory {

    ListView lv;
    baseAdapter vo ;
    List<ItemStory> itemStories ;
    TextView tv_nameTopic, tv_content;
    LinearLayout linear;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vova);
        initStories();
        initComponents();
        findViewByIds();
    }

    private void findViewByIds() {

        tv_nameTopic = (TextView) findViewById(R.id.tv_nameTopic) ;
        tv_content = (TextView) findViewById(R.id.content);
        linear = (LinearLayout) findViewById(R.id.linear);
    }


    private void initComponents() {
        lv = (ListView)findViewById(R.id.lv_topic) ;
        initStories();
        vo = new baseAdapter(this) ;
        lv.setAdapter(vo);
        lv.setOnItemClickListener(this);
        anim = AnimationUtils.loadAnimation(this,R.anim.tranlaste) ;

    }
    private void initStories() {
        itemStories = new ArrayList<>();

        itemStories.add(new ItemStory("Phần còn dư", "Ra khỏi cửa hàng vải, vợ âu yếm với chồng:\n" +
                "\n" +
                "- Anh yêu, em mua tấm lụa này để anh làm cà vạt đấy!\n" +
                "\n" +
                "- Em đáng yêu quá chừng! Nhưng sao em mua nhiều vậy?\n" +
                "\n" +
                "- Em nghĩ số vải còn dư lại sẽ đủ để em may áo dài."));

        itemStories.add(new ItemStory("Chồng là cái giống gì", "Một phụ nữ trả lời điện thoại: \"Ông hỏi ai?\".\n" +
                "\n" +
                "- Có phải vườn bách thú đấy không ạ?\n" +
                "\n" +
                "- Ông hỏi vườn bách thú à? Để tôi nhìn kỹ chồng tôi đang nằm ườn trên sofa kia mà ăn đậu phộng đã nhé... Không, tôi rất lấy làm tiếc, đây không phải là vườn bách thú... Mặc dù đúng là chồng tôi nửa giống con khỉ đột, nửa giống con hải mã vì có bộ ria nhưng ông gọi nhầm số rồi, đây không phải là vườn bách thú...\n" +
                "\n" +
                "- !!!!!"));

        itemStories.add(new ItemStory("Khuyên can bạn bè", "Người chồng thông báo với vợ:\n" +
                "\n" +
                "- Em này, anh đã mời một người bạn đến nhà ăn tối.\n" +
                "\n" +
                "- Cái gì? Anh điên à? Nhà cửa thì bề bộn, em thì không đi chợ, bát đĩa dơ bẩn chưa rửa. Mà em cũng chẳng muốn nấu một bữa ăn như vậy nữa.\n" +
                "\n" +
                "- Anh biết chứ, anh chồng thờ ơ đáp.\n" +
                "\n" +
                "- Thế mà anh còn cố tình mời mọc? - Cô vợ giận dữ.\n" +
                "\n" +
                "- À, vì anh chàng tội nghiệp kia đang nghĩ đến chuyện lập gia đình."));

        itemStories.add(new ItemStory("Căn cứ vào đâu?", "- Ba: Căn cứ vào đâu để biết tuổi thọ của động vật?\n" +
                "- Con: Có phải là căn cứ vào răng không bố? Nhưng con gà đâu có răng, con chịu thua .\n" +
                "- Ba: Đúng là căn cứ vào răng. Nhưng gà không có răng thì xem răng của chúng ta."));

        itemStories.add(new ItemStory("Bà vợ sư tử hà đông.", "Buổi tối, bà vợ là sư tử hà đông nấu nướng xong liền ra lệnh cho con gọi điện cho bố về ăn cơm ngay. Thằng con sau một hồi hì hục gọi chạy ra bảo mẹ\n" +
                "\n" +
                "Mẹ ơi, con gọi ba lần liền mà lần nào cũng có một cô trả lời. Bà vợ điên quá, đợi đến lúc chồng đi làm về liền nhảy ra đấm đá túi bụi. Ông chồng bị bất ngờ không hiểu vì sao chỉ kịp nằm lăn ra kêu cứu. Hàng xóm thấy vậy sang xem rất đông. Thấy thế, bà vợ lúc này mặt vẫn đang hầm hầm liền bảo thằng con.\n" +
                "\n" +
                "- Mày quay ra nói cho các bác ấy nghe đi, cái con kia nó trả lời máy của bố mày thế nào\n" +
                "\n" +
                "- Dạ, cô ấy bảo \"thuê bao quý khách vừa gọi hiện không liên lạc được...\""));

        itemStories.add(new ItemStory("Bơi nhiều vẫn mập", "Một phụ nữ đòi chồng lắp cho hệ thống nước nóng ở hồ bơi ngoài trời của gia đình để bà ta có thể bơi lội chống béo phì.\n" +
                "\n" +
                "- Ông chồng vặn lại: \"Con cá voi ngày nào cũng bơi mà có gày đi tí nào đâu\"."));

        itemStories.add(new ItemStory("Lỗi tại ai?", "Lúc chiều, hai vợ chồng cãi nhau bất phân thắng bại. Tối đi ngủ, anh chồng làm lành:\n" +
                "\n" +
                "- Xin lỗi em nhé, anh đã nghĩ lại rồi.\n" +
                "\n" +
                "- Ồ không, em cũng đang định xin lỗi anh.\n" +
                "\n" +
                "- Em không có lỗi, có lẽ do anh hơi nóng tính.\n" +
                "\n" +
                "- Do em! Mọi chuyện đều do em cả.\n" +
                "\n" +
                "- Anh đã bảo là tại anh cơ mà!\n" +
                "\n" +
                "- Tại sao anh cố chấp thế nhỉ?\n" +
                "\n" +
                "- Cô có câm đi không?"));

        itemStories.add(new ItemStory("Còn buồn hơn", "Hai bà mẹ ngồi tâm sự:\n" +
                "\n" +
                "- Tôi buồn quá chị ạ. Bốn đứa con gái lớn rồi chỉ kiếm được có mỗi một chàng rể.\n" +
                "\n" +
                "- Tôi còn buồn hơn bà ấy chứ. Tôi chỉ có một đứa con gái mà có tới thằng rể thứ năm rồi."));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        for(int i = 0; i < itemStories.size(); i++) {
            if (i == position) {
                tv_nameTopic.setText(itemStories.get(position).getTitle());
                tv_content.setText(itemStories.get(position).getContent());
                lv.setVisibility(View.INVISIBLE);
                linear.startAnimation(anim);
            }
        }
    }

    @Override
    public int getCount() {
        if(itemStories == null) {
            return 0;
        }
        return itemStories.size();
    }

    @Override
    public ItemStory getItem(int position) {
        return itemStories.get(position);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(lv.getVisibility() != View.INVISIBLE) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}


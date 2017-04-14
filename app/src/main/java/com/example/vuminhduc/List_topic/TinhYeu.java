package com.example.vuminhduc.List_topic;

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

public class TinhYeu extends AppCompatActivity implements AdapterView.OnItemClickListener,
        baseAdapter.Itemstory {

    ListView  lv;
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

        itemStories.add(new ItemStory("Cũng là một nạn nhân thôi","Anh chàng nọ là một ngư dân hay khoe tài. Trên tường nhà, anh ta treo đầy những bức ảnh có chú thích như:\n" +
                "- Cá kình, Thành bắt ở Mũi Né.\n" +
                "- Cá mập, Thành giết ở Hòn Re.\n" +
                "- Bạch tuộc, Thành săn ở......\n" +
                "- Sau ngày cưới, cô vợ anh ta treo thêm lên tường một tấm hình chồng với chú thích: Thành, cưới ở Phan Thiết."));

        itemStories.add(new ItemStory("Sợ nhất điều gì..","Trong đêm tân hôn, chồng âu yếm hỏi vợ:\n" +
                "\n" +
                "- Lúc chưa lấy anh, em sợ điều gì nhất?\n" +
                "\n" +
                "- Em… ngại quá!\n" +
                "\n" +
                "- Đừng ngại, cứ nói đi em yêu!\n" +
                "\n" +
                "- Em… em sợ… ế chồng!"));

        itemStories.add(new ItemStory("Chữa ghen","Một chàng vớ phải cô vợ có tính ghen. Nghe tin bạn có bí quyết \"triệt ghen\", anh ta liền tìm đến học hỏi. Thế nhưng cô vợ thậm chí còn đòi ly dị nên anh ta lại tìm đến người bạn thắc mắc:\n" +
                "\n" +
                "- Thế mày có giả vờ nói mê như tao bảo không?\n" +
                "\n" +
                "- Có, tao nói y nguyên.\n" +
                "\n" +
                "- Mày thử nhắc lại xem nào?\n" +
                "\n" +
                "- Liên ạ ... Anh ...chỉ ..yêu...mình ...e...em.\n" +
                "\n" +
                "- Trời ạ, Liên là vợ tao, thế mày không thay bằng tên của vợ mày à?"));

        itemStories.add(new ItemStory("Tặng","- Lan: Cậu có hai con chó! Tặng tớ 1 con nhé!\n" +
                "- Mai: Cậu muốn lấy con nào?\n" +
                "- Lan: Con trắng nhé!\n" +
                "- Mai: Ko được! Con trắng tớ rất thích!\n" +
                "- Lan: Vậy thì con đen!\n" +
                "- Mai: Tớ cũng muốn tặng cho cậu nhưng mà mẹ tớ dạy: đừng tặng người khác những gì mà mình ko thích!"));

        itemStories.add(new ItemStory("Con dấu của bác sĩ sản","Một cô gái đến phòng khám sản, bác sĩ khẳng định cô có bầu, rồi lặng thinh đóng lên bụng cô một con dấu gì đó. Về nhà cô bảo chồng đọc xem nội dung con dấu trên bụng cô là gì. Phải dùng kính lúp, anh chồng mới đọc được:\n" +
                "\n" +
                "- \"Khi nào có thể đọc được dòng chữ này bằng mắt thường, hãy đưa cô ấy đến nhà hộ sinh\""));

        itemStories.add(new ItemStory("Cưỡng Hiếp","Một cặp tình nhân đang tình cảm trong một công viên vắng vẻ\n" +
                "anh chàng thì thầm:\n" +
                "\n" +
                "Em có kêu mọi nguời không nếu bây giờ anh cưỡng hiếp em?\n" +
                "Cô gái:\n" +
                "\n" +
                "Chỉ khi nào anh không đủ sức mà thôi!\n" +
                "\n" +
                "Chàng trai:!"));

        itemStories.add(new ItemStory("Khoảnh khắc huy hoàng.","Cuối tháng, chồng đi làm về, mặt vênh váo, hùng hổ gọi vợ ra quát nạt.\n" +
                "\n" +
                "- Bây giờ tôi hỏi cô: Cái nhà này ai làm chủ?\n" +
                "\n" +
                "Cô vợ tát nhẹ vào má chồng, nựng yêu:\n" +
                "\n" +
                "- Thôi đi nỡm… Tháng này có lương rồi hả!"));

        itemStories.add(new ItemStory("Tai họa hay cơ may?","Ông già đến gặp chàng trai giận dữ chất vấn:\n" +
                "\n" +
                "- Con gái tôi nói rằng anh đã làm cho nó mang bầu! Bây giờ anh định thế nào đây?\n" +
                "\n" +
                "- Thưa bác, cháu đã có vợ và hai con và không muốn ly hôn, nhưng cháu sẵn sàng đền bù về vật chất. Khi đứa bé ra đời, cháu sẽ cấp cho nó một ngân phiếu trị giá 1,5 triệu franc, sau đó mua cho con gái bác một ngôi nhà đầy đủ tiện nghi do cô ấy đứng tên và mỗi tháng sẽ cấp cho cô ấy số tiền 30.000 franc, theo một cam kết bằng văn bản. Bác thấy như vậy đã được chưa?\n" +
                "\n" +
                "- Được, nhưng tôi muốn hỏi thêm một câu.\n" +
                "\n" +
                "- Xin bác cứ hỏi.\n" +
                "\n" +
                "- Nếu con gái tôi bị sẩy thai, anh có thể cho nó cơ may thứ hai không?"));

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

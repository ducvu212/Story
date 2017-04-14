package com.example.vuminhduc.List_topic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.vuminhduc.ItemStory;
import com.example.vuminhduc.baseAdapter;
import com.example.vuminhduc.story.MainActivity;
import com.example.vuminhduc.story.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.vuminhduc.story.MainActivity.listView;

public class Vova extends AppCompatActivity implements AdapterView.OnItemClickListener,
        baseAdapter.Itemstory {

    ListView  lv;
    baseAdapter vo ;
    List<ItemStory> itemStories ;
    TextView tv_nameTopic, tv_content;
    ScrollView scrollView;
    Animation anim;
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vova);
        findViewByIds();
        initStories();
        initComponents();

    }

    private void findViewByIds() {

        tv_nameTopic = (TextView) findViewById(R.id.tv_nameTopic) ;
        tv_content = (TextView) findViewById(R.id.content);
        scrollView = (ScrollView) findViewById(R.id.scroll) ;
        linear = (LinearLayout) findViewById(R.id.linear);
    }

    private void initComponents() {
        lv = (ListView)findViewById(R.id.lv_topic) ;
        initStories();
        vo = new baseAdapter(this) ;
        lv.setAdapter(vo);
        lv.setOnItemClickListener(this);
        anim = AnimationUtils.loadAnimation(this,R.anim.tranlaste) ;

        //lv.startAnimation(anim);
    }
    private void initStories() {
        itemStories = new ArrayList<>();
        itemStories.add(new ItemStory("Ai lấy ngục Bastille?", "Trong giờ học lịch sử nước Pháp, cô giáo thấy Vôva lơ đãng bất thình lình hỏi: “Vôva, ai đã lấy ngục Bastille?”\n" +
                "\n" +
                "- Thưa cô, em không lấy ạ.\n" +
                "\n" +
                "Cô giáo giận quá, mời phụ huynh đến trường. Cô giáo nói:\n" +
                "\n" +
                "- Trong giờ lịch sử nước Pháp, tôi hỏi ai đã lấy ngục Bastille, Vôva đã không chịu nghe giảng lại còn trả lời: “Thưa cô, em không lấy ạ”. Bác thấy thế có chịu được không cơ chứ.\n" +
                "\n" +
                "Ông bố Vôva đáp:\n" +
                "\n" +
                "- Cháu nhà tôi vốn thật thà, cháu đã nói không lấy ngục Bastille nghĩa là nó không lấy đâu. Tuy nhiên, để tôi về nhà xem nó có cất ở nhà không.\n" +
                "\n" +
                "Cô giáo bực quá, lên mách hiệu trưởng. Chẳng dè, hiệu trưởng nói:\n" +
                "\n" +
                "- Trẻ con có trót lấy thì nó chơi chán lại trả thôi mà."));

        itemStories.add(new ItemStory("Nó hình gì?", "Để hiểu học trò hơn, cô giáo bảo học sinh vẽ vào một tờ giấy mơ ước mai sau của mình. Khi cô xem, có em vẽ hình máy bay tỏ ý muốn làm phi công, em thì vẽ ống nghe muốn làm bác sĩ… Riêng Natasha để tờ giấy trắng nguyên, cô hỏi:\n" +
                "\n" +
                "- Chẳng lẽ lớn lên em không muốn làm gì cả sao?\n" +
                "\n" +
                "Natasha băn khoăn đáp:\n" +
                "\n" +
                "- Lớn lên em sẽ lấy chồng, nhưng chẳng biết nó hình gì?"));


        itemStories.add(new ItemStory("Vova nghĩ bậy.", "Vova đi chơi với Nana. Vova chọn 1 cái ghế đá ngồi xuống, khổ đây là lần đầu tiên nên Vova lúng túng lắm không biết nói gì cả. Nghĩ mãi Vova đanh liều nói 1 câu :\n" +
                "\n" +
                "- Nana, ấy đang nghĩ gì thế?\n" +
                "- Tớ nghĩ giống ấy !!!!!Nana trả lời bẽn lẽn.\n" +
                "\n" +
                "Bỗng Vova cười ha hả:\n" +
                "- Khiếp sao ấy bậy thế!!!!!!!"));

        itemStories.add(new ItemStory("Vova và câu hỏi dành cho cô giáo", "Trong giờ học, cô giáo muốn phát triển trí tưởng tượng và khả năng cảm nhận của học sinh nhỏ tuổi; cô đưa ra mấy câu hỏi như sau:\n" +
                "\n" +
                "- Các con hãy nghĩ xem, cái gì màu xám và rất là cứng?\n" +
                "- Bê tông ạ!\n" +
                "Cô giáo:\n" +
                "- Giỏi quá. Nhưng mà nó còn có thể là nhựa đường nữa, thế còn cái gì màu vàng, và ở trên cánh đồng?\n" +
                "- Con bò ạ!\n" +
                "- Đúng rồi! Nhưng còn có thể là đống rơm nữa,\n" +
                "Vova lẩm bẩm, từ phía cuối lớp:\n" +
                "- Hmmm…\n" +
                "Cô giáo:\n" +
                "- Em đứng lên ngay.\n" +
                "Vova:\n" +
                "- Thế em hỏi một câu được không?\n" +
                "Cô giáo thận trọng:\n" +
                "- Em thử nói đi!\n" +
                "- Thế cái gì trước khi cho vào miệng thì nó cứng, thẳng và khô ráo, còn sau khi ra khỏi miệng thì nó mềm nhũn, cong queo và ướt nhem?\n" +
                "Cô giáo đứng phắt dậy, mặt đỏ bừng, tiến thẳng đến tát rất kêu vào mặt Vova.\n" +
                "Vova xoa xoa má:\n" +
                "- Đúng rồi! Nhưng nó còn có thể là kẹo cao su nữa!"));

        itemStories.add(new ItemStory("Vova và thầy giáo dự giờ", "Tiết tiếng Anh\n" +
                "\n" +
                "Hôm nay lớp học của Vova có một số thầy giáo đến dự giờ. Cô giáo và các bạn học sinh đã chuẩn bị tất cả tình huống có thể xảy ra để buổi học diễn ra được “an toàn”. Nửa tiếng trôi qua êm đẹp, còn 15 phút nữa là hết giờ, cô giáo liền hỏi học sinh câu hỏi cuối cùng:\n" +
                "\n" +
                "- Bây giờ cô sẽ viết một câu tiếng Anh lên bảng, các em hãy cố gắng dịch nó ra tiếng Tây Ban Nha nhé! \n" +
                "Cô giáo đang viết dở câu thì viên phấn bị rơi, cô cúi xuống nhặt và tiếp tục viết cho hết câu. \n" +
                "- Và bây giờ ai sẽ dịch được câu này? \n" +
                "Vova lập tức giơ tay. Cô giáo thì rất run, nhìn quanh lớp nhưng ngoài Vova ra thì chẳng có ai giơ tay cả. Cô giáo đành chỉ định Vova phát biểu. \n" +
                "Vova rất tự tin nói dõng dạc: \n" +
                "- Giá mà cái váy nó ngắn hơn tí nữa!\n" +
                "\n" +
                "Cô giáo đỏ mặt, quát :\n" +
                "- Cái gì? Em ra ngay khỏi lớp học cho tôi!\n" +
                "Vova thu gom sách vở xong rồi quay lại nhìn thầy giáo dự giờ lẩm bẩm : \n" +
                "- Đã không biết thì đừng có nhắc !!"));

        itemStories.add(new ItemStory("Vova trông em.", "Vova phải trông em cho bố mẹ đi xuống phố mua sắm, cậu đành phải cho em theo đi câu cá. Tối hôm đó, cậu dằn dỗi với mẹ:\n" +
                "- Từ nay con không cho em đi câu nữa đâu. Chỉ mất công, chả được con cá nào!\n" +
                "- Ồ! Nó quấy khóc làm cá sợ phải không? Lần sau em sẽ quen, thôi không khóc nữa.\n" +
                "- Không phải thế! Em đã ăn hết mồi câu của con."));

        itemStories.add(new ItemStory("Cây son môi.", "Trong giờ học cô giáo đang giảng bài về con cò và con gấu. Để mở đầu cô giáo hỏi học sinh:\n" +
                "- cô hỏi cả lớp con gì biết bay nè!\n" +
                "Mọi cánh tay đều giơ lên trong đó có vova là giơ cao nhất và chưa đợi cô mời cu cậu đã đứng phắt lên trả lời :\n" +
                "-Thưa cô là con chim ạ .\n" +
                "Không đúng ý cô, cô hơi bực:\n" +
                "-Em nghĩ vậy nhưng cô nghĩ khác, cô nghĩ đó là con cò .\n" +
                "-Vậy các em cho cô biết con gì sống trong rừng có lông lá đầy mình ?\n" +
                "Lại la vo-va:\n" +
                "-Thưa cô đó là con khỉ ạ!\n" +
                "Lần này thì cô giáo bực thiệt rồi:\n" +
                "-Em nghĩ vậy nhưng cô nghĩ là con gấu. Các em còn muốn hỏi gì nữa không ?\n" +
                "Lại cu vova:-Thưa cô, vậy em đố cô chứ cái gì dài khoảng 10 cm, thụt ra thụt vào mà phụ nữ rất thích?\n" +
                "Cô giáo nghe xong đỏ cả mặt,liền mắng:\n" +
                "-Vova đố bậy cô đuổi em ra khỏi lớp bây giờ.\n" +
                "-Thưa cô cô nghĩ như thế nhưng theo em đó là……cây son môi!"));

        itemStories.add(new ItemStory("Vova trong giờ kể chuyện..", "Cô giáo đang đọc truyện “Ba chú heo con” cho các bé nghe đến đoạn một chú heo gặp bác nông dân và xin rơm:\n" +
                "\n" +
                "- Bác ơi, cho cháu xin ít rơm nhé!\n" +
                "\n" +
                "Cô giáo ngừng lại hỏi Vova:\n" +
                "\n" +
                "- Con có biết bác nông dân nói gì không?\n" +
                "\n" +
                "Vova :\n" +
                "\n" +
                "- Thưa cô, bác ấy bảo: “Trời ơi! Một con heo biết nói!”.\n" +
                "\n" +
                "- Cô giáo tức đỏ mặt, vừa học bài “Sự tích bánh chưng, bánh dày”, Cô lại hỏi tiếp:\n" +
                "\n" +
                "-Thế em có biết bánh chưng có từ bao giờ không?\n" +
                "\n" +
                "- Tính theo mùa thì có từ giáp Tết, tính theo ngày thì có tại hàng quà sáng lúc 5 giờ ạ!\n" +
                "\n" +
                "Cô giáo tức không chịu được liền mắng :\n" +
                "\n" +
                "- Em có biết tuần này đã bị điểm 2 lần thứ ba rồi không? Vova :\n" +
                "\n" +
                "- Thưa cô, em đã hiểu ý nghĩa câu: “Ghét của nào trời trao của ấy”."));


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("(POS" , position +"");
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
        if (listView.getVisibility() == View.VISIBLE) {
            return;
        }

    }

}

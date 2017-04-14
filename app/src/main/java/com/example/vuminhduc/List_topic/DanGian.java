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

public class DanGian extends AppCompatActivity implements AdapterView.OnItemClickListener,
        baseAdapter.Itemstory {

    ListView lv;
    baseAdapter vo;
    List<ItemStory> itemStories;
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
        lv = (ListView) findViewById(R.id.lv_topic);
        initStories();
        vo = new baseAdapter(this);
        lv.setAdapter(vo);
        lv.setOnItemClickListener(this);
        anim = AnimationUtils.loadAnimation(this,R.anim.tranlaste) ;

    }

    private void initStories() {
        itemStories = new ArrayList<>();

        itemStories.add(new ItemStory("Ai nịnh ai?", "Một anh nhà giàu hỏi người nghèo:\n" +
                "\n" +
                "- Tôi giàu anh có nịnh tôi không?\n" +
                "\n" +
                "Người nghèo:\n" +
                "\n" +
                "- Ông giàu mắc mớ gì đến tôi mà tôi phải nịnh ông?\n" +
                "\n" +
                "Nhà giàu:\n" +
                "\n" +
                "- Nếu tôi cho anh nửa gia tài, anh có nịnh tôi không?\n" +
                "\n" +
                "Người nghèo:\n" +
                "\n" +
                "- Lúc đó tôi giàu bằng ông rồi việc gì tôi phải nịnh ông.\n" +
                "\n" +
                "Nhà giàu:\n" +
                "\n" +
                "- Nếu tôi cho anh cả gia tài, anh có nịnh tôi không?\n" +
                "\n" +
                "Người nghèo:\n" +
                "\n" +
                "- Chắc chắn lúc đó ông phải nịnh tôi."));

        itemStories.add(new ItemStory("Nói sao cũng được..", "Ngày trước, có một người rất thích uống rượu, có rượu là uống không biết chán, cho nên sinh ra nghiện nặng. Một lần, anh ta đến kinh thành làm ăn, tình cờ gặp người quen. Oái oăm là người quen này rất keo kiệt.\n" +
                "\n" +
                "Sau khi gặp người quen, anh nghiện rượu nêu ý kiến :\n" +
                "\n" +
                "- Lâu lắm rồi chúng ta mới gặp nhau, hiện giờ tôi đang thèm chén rượu. Chúng ta về nhà anh chơi, có chén rượu cho tôi giải sầu thì hay quá.\n" +
                "\n" +
                "Người quen nói :\n" +
                "\n" +
                "- Nhà tôi ở cách đây xa lắm, chẳng nỡ để anh vất vả vậy.\n" +
                "\n" +
                "Anh nghiện nói :\n" +
                "\n" +
                "- Không sao, xa lắm cũng chỉ hai ba mươi dặm chứ mấy.\n" +
                "\n" +
                "Người quen nói :\n" +
                "\n" +
                "- Nhà tôi chật chội không dám mời anh.\n" +
                "\n" +
                "Anh nghiện rượu nói :\n" +
                "\n" +
                "- Chẳng hề gì, chỉ cần rộng bằng cánh cửa mở là được.\n" +
                "\n" +
                "Người quen nói :\n" +
                "\n" +
                "- Tôi không chuẩn bị cốc chén uống rượu, nên không uống được.\n" +
                "\n" +
                "Anh nghiện rượu nói ngay :\n" +
                "\n" +
                "- Xem anh nói đến mức nào nào, bao năm chúng ta là tri kỷ, không có chén cũng chẳng sao, bê cả lọ tu cũng được."));

        itemStories.add(new ItemStory("Khôn ra..", "Một lão nhà giàu đi dạo chợ quê xem có món hàng nào hời sẽ mua tích trữ. Thấy một chú bé cứ nhai mãi mấy hột táo, bèn hỏi:\n" +
                "\n" +
                "- Này nhóc, mày nhai mãi mấy hột táo ấy để làm gì?\n" +
                "\n" +
                "- Thưa ông, để cho khôn người ra.\n" +
                "\n" +
                "- Thế à? Bán cho tao vài hột được không?\n" +
                "\n" +
                "- Thưa ông, mười đồng hai hột.\n" +
                "\n" +
                "- Ðược, tiền đây.\n" +
                "\n" +
                "Lão ta đưa luôn mười đồng và cầm hai hột táo bỏ ngay vào miệng nhai lấy nhai để. Nhai mãi, một lúc sau lão ta hỏi chú bé:\n" +
                "\n" +
                "- Này nhóc! Tao nhai từ nãy đến giờ chả thấy khôn ra tí nào. Trong khi đó với mười đồng, tao có thể mua hàng rổ táo của những người khác.\n" +
                "\n" +
                "- Ðấy! Ðấy! Ông khôn ra rồi đấy! – Chú bé đắc chí kêu lên."));

        itemStories.add(new ItemStory("Nhân đức..", "Có người hay nói nịnh. Một hôm, đến thăm quan huyện, vừa vào dinh, đã khen rối rít:\n" +
                "\n" +
                "- Quan lớn nhân đức thật. Thú dữ cũng phải lánh đi nơi khác. Hôm qua, vừa bước chân vào địa hạt ta tận mắt tôi thấy cọp kéo nhau từng bầy đi sang huyện bên cạnh.\n" +
                "\n" +
                "Quan nghe, cũng chối tai, nhưng vẫn cười gượng. Một lúc, dân tới báo đêm qua cọp bắt mất ba mạng người, xin quan đưa lính về bắn trừ đi, kẻo nó ăn hết thiên hạ.\n" +
                "\n" +
                "Quan huyện quay lại hỏi khách:\n" +
                "\n" +
                "- Sao ngài bảo trông thấy cọp bỏ đi cả rồi !\n" +
                "\n" +
                "Người kia bí quá, nói liều:\n" +
                "\n" +
                "- Chắc quan huyện bên cạnh cũng nhân đức chẳng kém gì quan lớn, nên nó không có chỗ trú chân, đành phải quay trở lại huyện nhà."));

        itemStories.add(new ItemStory("Ước mơ", "- Quỷnh: Sao bà hay vẽ vậy?\n" +
                "- Mắm: Mỗi bức vẽ là 1 ước mơ của tôi...\n" +
                "- Quỷnh lật đật mấy bức tranh xem và thốt lên: Ồ! “ước mơ” của bà nhem nhuốc và khó hiểu quá!\n" +
                "- Mắm: Hứ!Hứ! Cái…gì???"));

        itemStories.add(new ItemStory("Quan lớn mua vàng..", "Theo lệ ngày xưa, ai làm quan thì mua món gì cũng chỉ phải trả nửa giá tiền, trừ mua vàng phải trả đủ.\n" +
                "\n" +
                "Một ông quan nọ vừa đến nhậm chứa, bảo hiệu vàng đem hai lạng đến bán cho ngài. Chủ hiệu vàng nghe tiếng quan dữ như cọp, mói bẩm:\n" +
                "\n" +
                "- Vàng mỗi lạng thực giá sáu chục đồng, song quan lớn thì trả một nửa cũng được. Quan cầm hai lạng vàng xem, rồi ung dung bỏ một lạng vào túi. Chủ hiệu tưởng quan chỉ mua có một lạng, còn lạng kia trả lại, nên khi quan vào nhà trong, anh ta vẫn đứng đấy đợi trả tiền. Hồi lâu quan ra, thấy vậy mới hỏi:\n" +
                "\n" +
                "- Mua bán xong rồi, còn đứng đấy làm gì? Chủ hiệu vàng đáp:\n" +
                "\n" +
                "- Con chờ quan lớn trả tiền cho. Quan bảo:\n" +
                "\n" +
                "- Tiền trả rồi, còn đòi gì nữa? Chủ hiệu vàng đáp: – Hai lạng, quan trả lại một lạng, lấy một lạng. Quan nổi giận:\n" +
                "\n" +
                "- Nhà ngươi lạ thật! Nhà ngươi bảo ta trả một nửa cũng được. Ta mua hai lạng, nhưng chỉ lấy một, trả lại một chẳng phải là đã trả một nửa là gì!!!"));

        itemStories.add(new ItemStory("Trứng và gà", "Một anh nọ khoe rằng :\n" +
                "- Nhà tớ có con gà trống to lắm, nó phải cao bằng cây đa cổ thụ trước nhà tớ, cũng phải đến 20 mét ấy chứ. Mỗi lần nó gáy thì đến tận kinh thành còn nghe thấy.\n" +
                "- Có gì đâu, hôm trước con gà mái nhà tớ vừa đẻ được một quả trứng to bằng cả cái làng…\n" +
                "- Cậu nói phét, làm gì có quả trứng nào to như thế.\n" +
                "- Ơ, không có quả trứng đó thì làm gì có con gà to như cậu kể."));

        itemStories.add(new ItemStory("Xiển vào dinh tổng đốc xin tiền..", "Gặp lúc hỏng thi, Xiển và mấy anh em bạn đồng môn ngồi buồn mới giở trò bù khú với nhau. Anh em biết Xiển có tài ứng đối, thách Xiển vào xin tiền quan tổng đốc.\n" +
                "\n" +
                "Bấy giờ tổng đốc Thanh Hóa khét tiếng là một người hiếu sát. Xiển bắt anh em giao kèo: nếu xin được tiền thì anh em cứ tính một đền thành ba, nghĩa là anh em sẽ phải trả cho Xiển một số tiền gấp ba số tiền Xiển xin được của quan. Bằng không dám xin, hoặc xin không được thì Xiển phải thết anh em một bữa no say. Tưởng đùa vui, nào ngờ Xiển vào tận dinh quan. Ai nấy chắc phen này Xiển sẽ làm ma không đầu.\n" +
                "\n" +
                "Một buổi sáng nọ, quan vừa mở mắt ra công đường đã thấy Xiển quỳ ở ngoài sân. Quan quắc mắt hỏi:\n" +
                "\n" +
                "- Thằng kia! Mày tới đây có việc gì?\n" +
                "\n" +
                "Xiển thưa:\n" +
                "\n" +
                "- Bẩm cụ lớn, con muốn nhờ tay cụ lớn hóa kiếp cho con.\n" +
                "\n" +
                "Quan quát: – Thằng này muốn chết à?\n" +
                "\n" +
                "Xiển trịnh trọng nói:\n" +
                "\n" +
                "- Bẩm chính thế à. Con nghe nói lưỡi gươm cụ lớn sắc lắm, nên muốn xin cụ lớn một nhát để hồn về chín xuối cho được mát mẻ.\n" +
                "\n" +
                "Quan gắt:\n" +
                "\n" +
                "- Thật là đồ điên, cuồng, ngu, ngộ. Vì sao mày lại muốn chết?\n" +
                "\n" +
                "Xiển đáp:\n" +
                "\n" +
                "- Bẩm cụ lớn, con là học trò thi hỏng, nhà lại nghèo, nghiệp đèn sách chẳng ra sao, nghĩ tủi thân hổ phận chả muốn sống nữa.\n" +
                "\n" +
                "Quan thấy Xiển dáng người học trò nho nhã, lại đối đáp đâu ra đấy một cách bình tĩnh liền bảo:\n" +
                "\n" +
                "- Nếu học trò học giỏ mà hỏng thi thì cũng còn đáng thương. Nếu dốt mà hỏng lại đòi chết thì chết cũng đánh đời. Vậy hãy ứng khẩu một bài thơ lấy đề là “điên cuồng ngu ngộ” ta xem.\n" +
                "\n" +
                "Xiển vâng lời, ứng khẩu đọc một hơi, mối câu có một trong bốn chữ của đầu đề:\n" +
                "\n" +
                "Cao Tổ điên hào kiệt\n" +
                "Võ Ðế ngộ thần tiên.\n" +
                "Tặng Ðiểm cuồng thiên địa\n" +
                "Nhan Tử ngu thánh hiền\n" +
                "\n" +
                "Nghe nói xong, quan biết Xiển có ý xỏ ngọt mình, song thấy Xiển là kẻ xuất khẩu thành chương, kính điển lau làu, văn thơ hàm súc, tỏ ra là người học thức rộng, lại có khí phách, liền thưởng cho ba chục quan tiền và bảo lui về.\n" +
                "\n" +
                "Thế là từ đó, ngoài cái tên Xiển Bột còn có một cái tên nữa là Xiển Ngộ."));

    }


    @Override
    public int getCount() {
        if (itemStories == null) {
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

}

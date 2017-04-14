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

public class TieuLam extends AppCompatActivity implements AdapterView.OnItemClickListener,
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

        itemStories.add(new ItemStory("Biết nhường nào”", "Một chàng trai vẽ một mũi tên xuyên qua trái tim thể hiện tình yêu của mình với cô gái,\n" +
                "Không những thế, trên mũi tên chàng còn vẽ thêm nhiều quả tim nhỏ máu. Sau đó chàng viết chú thích bên cạnh: “Hãy xem anh yêu em biết nhường nào” rồi gửi cho nàng.\n" +
                "Nàng gửi trả và ghi thêm bên dưới:\n" +
                "\n" +
                "- Xâu thịt dê của anh có ý nghĩa gì vậy?"));

        itemStories.add(new ItemStory("Cách đây… 2 phút thôi ạ!", "Trước cổng thiên đàng, Thánh Peter đang tra cuốnsổ lớn xem người vừa đến có xứng đáng được chấp nhận không. Sau mộthồi, Thánh nhíu mày nói:\n" +
                "- Không có gì xấu xa trong cuộc đời của anh,nhưng anh cũng chưa làm điều gì thực sự tốt đẹp. Nếu anh chỉ rađược một điều tốt đẹp mà anh đã làm thì ta chấp nhận.\n" +
                "Anh chàng hào hứng kể ngay:\n" +
                "- Con đang lái xe trên đường bỗng thấy một nhómcôn đồ khoảng 50-tên đang tấn công một cô gái tội nghiệp. Con dừnglại, dùng cờ-lê đập một phát làm tên cầm đầu to lớn ngã xuống. Sauđó, con quay sang đồng bọn của hắn, đang vây xung quanh và quát to:\n" +
                "- Hãy để cho cô gái vô tội này được yên! Cút đitrước khi tao dạy cho tất cả bọn bay một bài học đau đớn!\n" +
                "- Thật ư? Thế con đã dạy cho chúng bài học đóchưa? – Thánh Peter cảm động hỏi.\n" +
                "- Dạ rồi, chỉ mới cách đây… 2 phút thôi ạ!"));

        itemStories.add(new ItemStory("Gà trống đi chơi.", "Vào một ngày rảnh rỗi, 2 chú gà trống rủ nhau đi chơi. Chú thứ nhất hăng hái đưa ra hàng loạt địa chỉ thú vị như: đi sở thú thăm họ hàng xa là mấy anh đà điểu, đi nông trường tán gẫu với mấy anh trống choai…\n" +
                "Sau 1 hồi trầm tư, chú gà trống thứ 2 mới từ tốn nói:\n" +
                "- Ði vào siêu thị chơi\n" +
                "\n" +
                "Chú thứ nhất ngạc nhiên:\n" +
                "- Vào để làm gì ?\n" +
                "- Vào nhìn lũ gà mái đang… khoả thân nằm trên kệ"));

        itemStories.add(new ItemStory("Được thế thì còn gì bằng..", "Cô gái đứng trước, ông già đứng sau, cả hai đang chăm chú xem phim ngoài bãi làng.\n" +
                "\n" +
                "Một thanh niên đứng cạnh thò tay vỗ vào mông cô gái.\n" +
                "\n" +
                "- Ông làm gì thế? cô gái quay sang hỏi ông già\n" +
                "\n" +
                "- Tôi làm tổ trưởng tổ phụ lão: Ông già trả lời Cô gái quay lại xem phim.\n" +
                "\n" +
                "Anh thanh niên lại vỗ nhẹ cái nữa.\n" +
                "\n" +
                "- Ông già rồi, thôi việc ấy đi được rồi: Đúng thế, tôi muốn lắm rồi mà họ vẫn chưa cho.\n" +
                "\n" +
                "Cô gái lại quay lên xem phim. Anh thanh niên lại vỗ vào mông cô gái cái nữa.\n" +
                "\n" +
                "- Nếu ông còn tiếp tục, tôi sẽ đi báo chính quyền: Thế còn gì bằng, tôi làm việc đó hoàn toàn ngoài ý muốn ! =)) =))"));

        itemStories.add(new ItemStory("Quan sát và phân tích…", "Trong một lớp thực tập pháp y, giáo sư già đáng kính đang đứng bên cạnh một cái xác ướp dung để hướng dẫn thực tập.\n" +
                "\n" +
                "- Làm nghề này điều quan trọng thứ nhất là phải bạo dạn và không sợ bẩn: Nói rôì giáo sư đút ngón tay vào hậu môn xác ướp và cho lên mồm mút, sau đó ông ta bắt các sinh viên làm theo. Sinh viên ở dưới bất đắc dĩ lam theo va thi nhau nôn oe.\n" +
                "\n" +
                "- Điều quan trong thứ hai, giáo sư bình thản nói tiếp : Đó là óc quan sát và phân tích, vừa rồi tôi đút ngon tay trỏ nhưng khi đưa lên mồm mút thì là ngón giữa\n" +
                "\n" +
                "-Ôi mẹ ơi !!!!!!!!"));

        itemStories.add(new ItemStory("Làm ăn..", "Tới tuổi trưởng thành, chị em nhà muỗi nọ chia tay nhau mỗi kẻ một phương trời kiếm ăn. Sau một thời gian, chúng gặp lại nhau, tay bắt mặt mừng rồi hàn huyên chuyện làm ăn.\n" +
                "\n" +
                "- Muỗi em hỏi muỗi chị: Dạo này sao trông chị gầy xác xơ thế?\n" +
                "\n" +
                "- Muỗi chị lắc đầu: Chán lắm em ạ! Vì lâu nay cặp vợ chồng nơi chị cư ngụ không… cãi nhau nữa.\n" +
                "- Việc họ cãi nhau thì liên quan gì đến chị? – Muỗi em ngạc nhiên.\n" +
                "\n" +
                "- Muỗi chị giải thích: Sao em chậm hiểu thế! Họ mà cãi nhau, anh chồng bỏ ra ghế xa lông… ngủ thì chị mới có cơ hội “làm ăn” chứ!\n" +
                "\n" +
                "- Muỗi em thương hại: Hay là chị ra công viên với em đi! Ở đó có nhiều cặp tình nhân ôm nhau chẳng biết trời đâu đất đâu nữa. Lúc đó chúng mình tha hồ “làm ăn”…\n" +
                "\n" +
                "- Muỗi chị rụt vòi: Không dám đâu! Nghe nói ở đó lắm kẻ nghiện ngập lắm. Lỡ mình chích nhầm chúng rồi đâm nghiện lây, cứ phải tìm dân nghiện mà chích thì khổ cả một đời."));

        itemStories.add(new ItemStory("Ai làm đúng?", "Trong giờ kiểm tra môn Tiếng Việt ở Đại Học. Đề bài ra có một câu như sau \"Phụ nữ không có đàn ông không là gì cả\" và yêu cầu các sinh viên phải đặt dấu câu cho đúng.\n" +
                "Khi chấm bài giảng viên phát hiện ra tất cả các nam sinh viên đều viết: \"Phụ nữ không có đàn ông, không là gì cả\". Trong khi đó các nữ sinh viên thì lại viết: \"Phụ nữ không có! Đàn ông không là gì cả.\""));

        itemStories.add(new ItemStory("Cảnh sát giao thông..", "Cảnh sát giao thông chặn một chiếc xe bé nhỏ, kiểm tra kỹ lưỡng từ bình cứu hoả đến hộp cứu thương, bảo hiểm đường bộ… mọi thứ đều không bắt bẻ vào đâu được.\n" +
                "\n" +
                "- Thôi được, anh thật là một tài xế gương mẫu. Nào, ta làm 100 gr vodka nhân ngày lễ!\n" +
                "\n" +
                "- Ồ không, để anh lại phạt tôi ư?\n" +
                "\n" +
                "- Yên tâm uống đi, hôm nay là ngày lễ mà! Cụng ly xong, người đàn ông chui vào xe đi tiếp. Tay cảnh sát móc máy bộ đàm ra gọi:\n" +
                "\n" +
                "- Alô! Số 3 gọi số 5… Xécgây à, Ivan đây, tớ còn nợ cậu 100 rúp phải không? Hãy lấy số tiền ấy từ chiếc Lada trắng sắp chạy qua nhé! Thằng cha lái xe vừa uống rượu đấy!"));
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

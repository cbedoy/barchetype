package cbedoy.barchetype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cbedoy.barchetype.io.common.Button;
import cbedoy.barchetype.io.common.Circle;
import cbedoy.barchetype.io.common.CommonHeader;
import cbedoy.barchetype.io.common.Credit;
import cbedoy.barchetype.io.common.Detail;
import cbedoy.barchetype.io.common.DetailSelector;
import cbedoy.barchetype.io.common.Divider;
import cbedoy.barchetype.io.common.DividerSection;
import cbedoy.barchetype.io.common.DividerSectionTitle;
import cbedoy.barchetype.io.common.Circles;
import cbedoy.barchetype.io.common.Section;
import cbedoy.barchetype.io.common.Selector;
import cbedoy.barchetype.io.common.Single;
import cbedoy.barchetype.io.common.User;
import cbedoy.barchetype.io.common.Value;
import cbedoy.barchetype.io.common.base.BaseCell;
import cbedoy.barchetype.io.common.base.BaseViewCell;

public class MainActivity extends AppCompatActivity implements BaseViewCell.IBaseViewCellDelegate{

    private RecyclerView mRecyclerView;
    private BaseViewCell mViewCell;
    private List<BaseCell> mDataModel;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setNickname("Carlos Bedoy");
        user.setEmail("carlos.bedoy@gmail.com");
        user.setAvatar("https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-9/16711951_1768631583163199_4913513086081154093_n.jpg?oh=9c276df7908cf8b011a8578cdee57f80&oe=5939BE3F");

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);

        List<Circle> musicCircles = new ArrayList<>();
        List<Circle> girlCircles = new ArrayList<>();

        musicCircles.add(new Circle("Tame Impala", "https://pbs.twimg.com/profile_images/714923771958833154/oxtQm0Sl.jpg"));
        musicCircles.add(new Circle("Rubytates", "http://revistakuadro.com/wp-content/uploads/2014/12/10151381_563583377081832_1485062960_n-1.jpg"));
        musicCircles.add(new Circle("No te va a gustar", "https://pbs.twimg.com/profile_images/683447896172310528/Ap-TN_Rp.jpg"));
        musicCircles.add(new Circle("Division minuscula", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR3MAey88fCkRntxAIqTY3-F12cfBFpOzVmCa6fetiGo7aCqOSGxQ"));
        musicCircles.add(new Circle("Enrique Bumbury", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_YxwL0YMuC9VrbMKCnYgJG-Md_7vhaa7FS-YJGmw5LUZOBk6x"));
        musicCircles.add(new Circle("Chunk no captian chunk!", "http://chunknocaptainchunk.com/images/600x.jpg"));
        musicCircles.add(new Circle("Hijos del sol", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/c0.1.200.200/p200x200/13600342_1768050273440622_8053341707688105768_n.jpg?oh=384963f2b5708080cfcf3b0630a2e5c6&oe=58FF151F"));
        musicCircles.add(new Circle("A day to remember", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQvNmU72JPCJPt1o6WICVu_hRZehEeXi6aE24LJpksQMmm-92vA"));
        musicCircles.add(new Circle("The whitest boy alive", "http://neonized.net/blog/wp-content/files/2014/06/the-whitest-boy-alive-8.jpg"));
        musicCircles.add(new Circle("Zirconia", "https://scontent-atl3-1.xx.fbcdn.net/v/t1.0-1/p320x320/16194995_1488513061160281_3310770891721915965_n.jpg?oh=5fbae6fbc38f70ff8a3685ba8f899e09&oe=593B6E4E"));
        musicCircles.add(new Circle("Siddartha", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQelAoAy3RjaQ1Uq5ksGkWhT-O0VDmbUgWx-gBHpU12XtNRW8CxAQ"));
        musicCircles.add(new Circle("Natalia Lafourcade", "http://www.milenio.com/hey/autora-veracruzana-disenadora-moda_MILIMA20151101_0025_1.jpg"));
        musicCircles.add(new Circle("Reyno", "http://img.informador.com.mx/biblioteca/imagen/370x277/1217/1216966.jpg"));
        musicCircles.add(new Circle("Camilo septimo", "http://img.informador.com.mx/biblioteca/imagen/370x277/1142/1141751.jpg"));
        musicCircles.add(new Circle("The 1975", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkYgJSoh8TGqj0rdQivbBL1-nygd09uEHZAb5dmnaFwL4lsnO1"));
        musicCircles.add(new Circle("Knife Party", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTPfoe5BNFmBHcMcy2Yb7kCmdGbAxJRKkabgEf0BRgmHU9Ieofaig"));

        girlCircles.add(new Circle("Alexandra", "http://acidcow.com/pics/20130325/fitness_chicks_are_always_gorgeous_13.jpg"));
        girlCircles.add(new Circle("Annie", "https://pbs.twimg.com/profile_images/578013883379552256/jylfJno1.jpeg"));
        girlCircles.add(new Circle("Rebeca", "https://s-media-cache-ak0.pinimg.com/736x/ab/a6/d9/aba6d99b54751ee1b059cb6832c799e0.jpg"));
        girlCircles.add(new Circle("Britany", "http://www.feedmen.com/wp-content/uploads/2016/02/MASSY_ARIAS.jpg"));
        girlCircles.add(new Circle("Selene", "http://www.shockmansion.com/wp-content/myimages/2015/09/Posted-On-Shock-Mansion1822.jpg"));
        girlCircles.add(new Circle("Jen", "http://data.whicdn.com/images/117787282/superthumb.jpg"));


        Collections.shuffle(musicCircles);
        Collections.shuffle(girlCircles);

        mViewCell = new BaseViewCell();

        mDataModel = new ArrayList<>();
        mDataModel.add(new CommonHeader(user));
        mDataModel.add(new Section("Abstract"));
        mDataModel.add(new Single("Workaholic, developer, musician, I love my life and make amazing stuff, I have 5 years as Full Stack Android Developer and 3 years as Full Stack iOS Developer, I've been working within startup, creating amazing apps by differentes environments, from pay services, making conversations, share money, messaging applications, using xmpp protocol, etc, I'm fan lover by desing patterns, code uncoupled, flat desing & UX, also I'm musician self productor, with strong kilss by playing guitar and composing"));
        mDataModel.add(new Divider());
        mDataModel.add(new Detail("Phone", "+52 4494674121"));
        mDataModel.add(new Divider());
        mDataModel.add(new Detail("Job", "Mobile Developer"));
        mDataModel.add(new Divider());
        mDataModel.add(new Detail("Hobbies", "Fitness, Music, Racing"));
        mDataModel.add(new Divider());
        mDataModel.add(new Detail("Languages", "Spanish native, English professional"));
        mDataModel.add(new Divider());
        mDataModel.add(new Detail("Code", "Java, Objetive-C, Swift, Kotlin, Python"));
        mDataModel.add(new Divider());
        mDataModel.add(new DividerSection());
        mDataModel.add(new Section("Personal"));
        mDataModel.add(new Selector("Single", true));
        mDataModel.add(new Divider());
        mDataModel.add(new Selector("Musician", true));
        mDataModel.add(new Divider());
        mDataModel.add(new Selector("Drugs", false));
        mDataModel.add(new Divider());
        mDataModel.add(new DetailSelector("Smoke", "But i'm trying to left", true));
        mDataModel.add(new Divider());
        mDataModel.add(new DetailSelector("Crusi", "I'm a fuckin' cursi sometimes", true));
        mDataModel.add(new Divider());
        mDataModel.add(new DividerSection());
        mDataModel.add(new Section("Body"));
        mDataModel.add(new Value("Age", String.valueOf(25) + " years"));
        mDataModel.add(new Divider());
        mDataModel.add(new Value("Weight", String.valueOf(68.9) + " Kilograms"));
        mDataModel.add(new Divider());
        mDataModel.add(new Value("Height", String.valueOf(1.78)+ " meters"));
        mDataModel.add(new Divider());
        mDataModel.add(new Value("Waist", String.valueOf(78) + " centimeters"));
        mDataModel.add(new Divider());
        mDataModel.add(new Value("Fat percent", String.valueOf(14.9) + " percentage"));
        mDataModel.add(new Divider());
        mDataModel.add(new DividerSection());
        mDataModel.add(new Section("My friends"));
        mDataModel.add(new Single("Success isn’t given. It’s earned. On the track, on the field, in the gym. With blood, sweat, and the occasionar tear."));
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSectionTitle("Magic People"));
        mDataModel.add(new User("Paulina Robledo", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16427789_1517105718329857_2992088752100999769_n.jpg?oh=9fc3ed72dc73dac41058a6b5a1ee6ce9&oe=592D1378"));
        mDataModel.add(new User("David Garcia", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/15401157_1179556962093016_5215849633386648510_n.jpg?oh=2554623afb233e9e43f98867b0576788&oe=592D6B0E"));
        mDataModel.add(new User("Karlo Marin", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16640707_1344245382302517_3257607231563192312_n.jpg?oh=5f45f9ba4cae3ffacffff22779fbf961&oe=593CDEDC"));
        mDataModel.add(new User("Alejandra Oregel", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/c0.0.240.240/p240x240/16508100_10212145347449411_9184093904133491610_n.jpg?oh=56566af6e02eb8b93464ba24e1a47a91&oe=593F6A2D"));
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSectionTitle("Friends"));
        mDataModel.add(new User("Diego Jasso", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/13087807_10209078129008198_4996004268502137319_n.jpg?oh=c8307ca09d985f967a511786a2a39b4f&oe=593C3C16"));
        mDataModel.add(new User("Oliver Rangel", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/13627218_10208404690268390_3247060209528003376_n.jpg?oh=c0a0e81f36c12a238cd8cc2d0ca71894&oe=59375BB6"));
        mDataModel.add(new User("Cesar Rodriguez", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16388274_1536996386315265_5510362488186915189_n.jpg?oh=7bf0706fbe7eb6902646bd5115ac1f43&oe=592B3791"));
        mDataModel.add(new User("Priscila Aguilar", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/c1.0.240.240/p240x240/15542438_1250049871727944_2525287983791864100_n.jpg?oh=4ca19395cf43a4af176b9efb52d22cb1&oe=5947F2F9"));
        mDataModel.add(new User("Fernanda Perez", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16194870_1190174574434799_4549625732303345788_n.jpg?oh=3130078aedee67ad5676a2515d202e66&oe=5934FD38"));
        mDataModel.add(new User("Marisol Alba", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/15439944_740724056082591_454814636899910122_n.jpg?oh=2368920d449615fcd4e401e648b98316&oe=593458C5"));
        mDataModel.add(new DividerSection());
        mDataModel.add(new Section("Music"));
        mDataModel.add(new Circles(musicCircles));
        mDataModel.add(new DividerSection());
        mDataModel.add(new Section("Girls"));
        mDataModel.add(new Circles(girlCircles));
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSection());
        mDataModel.add(new Button("Follow me!!!", R.color.colorAccent));
        mDataModel.add(new Credit("Code && Fitness && Music"));

        mViewCell.setDataModel(mDataModel);
        mViewCell.setContext(getApplicationContext());
        mViewCell.setDelegate(this);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mViewCell);

    }

    @Override
    public void onSelectedCell(BaseCell cell) {

    }
}

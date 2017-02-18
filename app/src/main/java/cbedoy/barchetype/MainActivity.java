package cbedoy.barchetype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cbedoy.barchetype.io.common.CommonHeader;
import cbedoy.barchetype.io.common.Credit;
import cbedoy.barchetype.io.common.Detail;
import cbedoy.barchetype.io.common.DetailSelector;
import cbedoy.barchetype.io.common.DividerSection;
import cbedoy.barchetype.io.common.DividerSectionTitle;
import cbedoy.barchetype.io.common.Header;
import cbedoy.barchetype.io.common.Selector;
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

        mViewCell = new BaseViewCell();

        mDataModel = new ArrayList<>();
        mDataModel.add(new CommonHeader(user));
        mDataModel.add(new DividerSection());
        mDataModel.add(new Detail("Phone", "+52 4494674121"));
        mDataModel.add(new Detail("Job", "Mobile Developer"));
        mDataModel.add(new Detail("Hobbies", "Fitness, Music, Racing"));
        mDataModel.add(new Detail("Languages", "Spanish native, English professional"));
        mDataModel.add(new Detail("Code", "Java, Objetive-C, Swift, Kotlin, Python"));
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSectionTitle("Body"));
        mDataModel.add(new Value("Age", String.valueOf(25)));
        mDataModel.add(new Value("Weight", String.valueOf(68.9)));
        mDataModel.add(new Value("Height", String.valueOf(1.78)));
        mDataModel.add(new Value("Waist", String.valueOf(78)));
        mDataModel.add(new Value("Fat percent", String.valueOf(14.9)));
        mDataModel.add(new DividerSection());
        mDataModel.add(new DividerSectionTitle("Best Friends"));
        mDataModel.add(new User("David Garcia", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/15401157_1179556962093016_5215849633386648510_n.jpg?oh=2554623afb233e9e43f98867b0576788&oe=592D6B0E"));
        mDataModel.add(new User("Karlo Marin", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16640707_1344245382302517_3257607231563192312_n.jpg?oh=5f45f9ba4cae3ffacffff22779fbf961&oe=593CDEDC"));
        mDataModel.add(new User("Paulina Robledo", "https://scontent.fmex4-1.fna.fbcdn.net/v/t1.0-1/p240x240/16427789_1517105718329857_2992088752100999769_n.jpg?oh=9fc3ed72dc73dac41058a6b5a1ee6ce9&oe=592D1378"));
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
        mDataModel.add(new DividerSectionTitle("Personal"));
        mDataModel.add(new Selector("Single", true));
        mDataModel.add(new Selector("Musician", true));
        mDataModel.add(new Selector("Drugs", false));
        mDataModel.add(new DetailSelector("Smoke", "But i'm trying to left", true));
        mDataModel.add(new DetailSelector("Crusi", "I'm a fuckin' cursi sometimes", true));
        mDataModel.add(new DividerSection());
        mDataModel.add(new Credit("Make with <3 Aguascalientes"));
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

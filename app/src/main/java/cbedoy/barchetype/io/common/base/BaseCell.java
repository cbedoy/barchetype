package cbedoy.barchetype.io.common.base;

/**
 * RecyclerChatView
 * Created by Bedoy on 11/14/16.
 */

public class BaseCell
{
    public BASE_CELL_TYPE getType() {
        return type;
    }

    public void setType(BASE_CELL_TYPE type) {
        this.type = type;
    }

    public enum BASE_CELL_TYPE {
        OPTION(0),
        SECTION(1),
        COUNTER(2),
        DIVIDER(3),
        SELECTOR(4),
        DIVIDER_SECTION(5),
        DETAIL_SELECTOR(6),
        DETAIL(7),
        CREDIT(8),
        HEADER(9),
        VALUE(10),
        BUTTON(11),
        SINGLE(12),
        USER(13),
        DIVIDER_SECTION_TITLE(14),
        COMMON_HEADER(15),
        MEMBERS(16);

        private final int value;

        BASE_CELL_TYPE(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }



    private BASE_CELL_TYPE type;
}

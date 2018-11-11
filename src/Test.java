import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList();      //new一个ArrayList对象
        list.add("鼠");                         //添加元素，ArrayList会保持顺序
        list.add("牛");
        list.add("虎");
        list.add("兔");
        list.add(1, "龙");          //类比数组，可以通过索引来改变元素位置
        System.out.println(list.indexOf("龙"));                           //返回该元素所在位置
        System.out.println(list.subList(0, 2));                            //返回索引0~2之间的元素，其中下限包含，上限不包含
        System.out.println(list.get(0));//list类中有通过索引直接获取值的方法
        System.out.println(list);   //如果元素类型是基本类型可以直接输出，但是如果元素类型是自定义类的话，只能遍历得到
        for (String s : list) {
            System.out.println(s);
        }
    }
}

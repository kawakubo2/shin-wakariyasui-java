package chapter20;
import java.util.List;
/*
 * 部署を表すレコードす
 * 例題（FlatmapExample.java、JoiningExample.java）で使います
 */

public record Department (String name,String manager, List<String> employees) {
	
	public static List<Department> getList() {
		
		var list = List.of (
			new Department("総務","田中宏",   List.of("佐藤渉","平山花子","斎藤雄一")),
			new Department("経理","鈴木恵子", List.of("向井修","山崎洋子","平木真理")),
			new Department("営業","木村薫",   List.of("真田真澄","増山次郎","戸田絵里"))
		);
		return list;
	}
}

package day20;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Snack {	
	
	private String name; //小吃
	private String description; //敘述
	private Integer price; //價格
	private String location;  //地址
	private String type; //類型
	private Double latitude; //緯度
	private Double longitude; //經度
	
	private Double distance; //距離
	
	
	
	
}

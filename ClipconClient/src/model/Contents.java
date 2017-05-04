package model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contents {
	public static String TYPE_STRING = "STRING";
	public static String TYPE_IMAGE = "IMAGE";
	public static String TYPE_FILE = "FILE";

	private String contentsType;
	private long contentsSize;

	// �׷쳻�� �� Data�� �����ϴ� ����Ű��
	public String contentsPKName;

	private String uploadUserName;
	private String uploadTime;
	// XXX[����]: uploadTime�� Ŭ���̾�Ʈ���� �����ϴ� ������ ���� parser ����

	// String Type: String��, File Type: FileOriginName
	private String contentsValue;
	private Image contentsImage;
	
	private StringProperty typeProperty;
	private StringProperty contentsProperty;
	//private ObjectProperty<ImageView> contentsImageProperty;
	//private ObjectProperty contentsProperty;
	private StringProperty uploaderProperty;
	
	/**
	 * @author delf �ӽ� ������
	 */
	public Contents(String contentsType, long contentsSize, String contentsPKName, String uploadUserName, String uploadTime, String contentsValue, Image contentsImage) {
		// this(contentsType, contentsSize, contentsPKName, uploadUserName, uploadTime, null);
		this.contentsType = contentsType;
		this.contentsSize = contentsSize;
		this.contentsPKName = contentsPKName;
		this.uploadUserName = uploadUserName;
		this.uploadTime = uploadTime;
		this.contentsValue = contentsValue;
		this.contentsImage = contentsImage;
		
		this.typeProperty = new SimpleStringProperty(contentsType);
		this.contentsProperty = new SimpleStringProperty(contentsValue);
		//ImageView imageView = new ImageView(contentsImage);
		//this.contentsImageProperty = new SimpleObjectProperty<ImageView>(imageView);
		//this.contentsProperty = new SimpleObjectProperty();
		this.uploaderProperty = new SimpleStringProperty(uploadUserName);
	}
}
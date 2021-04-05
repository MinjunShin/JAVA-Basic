package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\JavaPractice\\newFile.txt");
		//아직 파일 생성 전 단계임.
		file.createNewFile(); // 경로에 파일 생성
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//파일 속성을 알아보는 메서드들을 출력
		file.delete(); // 파일삭제	
	
	}

}

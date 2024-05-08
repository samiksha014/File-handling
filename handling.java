import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;


class filehandle{

	void createfile()               //method to create file 
	{
		try {
	
			File obj = new File("filee.txt");
			if(obj.createNewFile()){
				System.out.println("file created : "+obj.getName());
		}
	
		else{
			System.out.println("file already exists");
			}
		}
	
	catch(IOException e){
			System.out.println("an error occured");
		}
	}
	
	void writefile()               //method to write to file
	{
		try {
			FileWriter writer = new FileWriter("filee.txt");
			writer.write("File handling is important part of any application");
			writer.close();
			System.out.println("Written part is done in file successfully!!");
		}
		catch(IOException e){
			System.out.println("Error Ocuured !!");
			}
	}
	
	void readfile()               //method to read the file
	{
		try{
		
			File obj = new File("filee.txt");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
				System.out.println("The file has been read successfully!!");
				
		}
		sc.close();
	     }		
		catch(FileNotFoundException e){
		System.out.println("Error!");
		}
	}
	
	void deletefile()
	{
		File obj = new File("filee.txt");
		if(obj.delete()){
		System.out.println("Deleted file :- "+obj.getName());
		System.out.println("The file has been deleted!!");
		}
		else{
			System.out.println("Failed !!");
		}
	}	

public static void main(String args[])
{
	filehandle fh = new filehandle();
	fh.createfile();
	
	System.out.println("\n");
	fh.writefile();
	
	System.out.println("\n");
	fh.readfile();
	
	System.out.println("\n");
	fh.deletefile();
}
}


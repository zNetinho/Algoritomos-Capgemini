import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class msgCriptografia{

	public static void main(String[] args) {

   try{

     KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
     SecretKey chaveBCA = keygenerator.generateKey();

     Cipher cifraDES;

     // Cria a criptografia
     cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding");

     // Inicializa a criptografia para o processo de encriptação
     cifraDES.init(Cipher.ENCRYPT_MODE, chaveBCA);

     // Texto puro
     byte[] s = "tenha um bom dia".getBytes();

     System.out.println("Texto [Formato de Byte] : " + s);
     System.out.println("Texto Puro : " + new String(s));

     byte[] textoEncriptado = cifraDES.doFinal(s);

     System.out.println("Texto Encriptado : " + textoEncriptado);

    
     cifraDES.init(Cipher.DECRYPT_MODE, chaveBCA);

     //leitura da criptografia
     byte[] textoDecriptografado = cifraDES.doFinal(textoEncriptado);

     System.out.println("Texto Decriptografado : " + new String(textoDecriptografado));}
 
   	catch(NoSuchAlgorithmException e){
       e.printStackTrace();
   	}catch(NoSuchPaddingException e){
       e.printStackTrace();
   	}catch(InvalidKeyException e){
       e.printStackTrace();
   	}catch(IllegalBlockSizeException e){
       e.printStackTrace();
   	}catch(BadPaddingException e){
       e.printStackTrace();}
 }
}
   	
 
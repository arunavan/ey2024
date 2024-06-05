package io;

import java.io.*;
public class LineNumberReaderExample{
  public static void main(String[] args) throws Exception{
  
  FileReader freader = null;
  LineNumberReader lnreader = null;
  try{
  
  freader = new FileReader("e:\\cg.txt");
  lnreader = new LineNumberReader(freader);
  String line = "";
  while ((line = lnreader.readLine()) != null){
  System.out.println("Line:  " + lnreader.getLineNumber() + ": " + line);
  }
  }
  finally{
  freader.close();
  lnreader.close();
  }
  }
}
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.time.*;
class SearchComponent{
	int size;
	int range;
	myLinkedList contactlist,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
	SearchComponent(myLinkedList list,int range){
		this.contactlist=list;
		this.range=range;
		A=new myLinkedList();
		B=new myLinkedList();
		C=new myLinkedList();
		D=new myLinkedList();
		E=new myLinkedList();
		F=new myLinkedList();
		G=new myLinkedList();
		H=new myLinkedList();
		I=new myLinkedList();
		J=new myLinkedList();
		K=new myLinkedList();
		L=new myLinkedList();
		M=new myLinkedList();
		N=new myLinkedList();
		O=new myLinkedList();
		P=new myLinkedList();
		Q=new myLinkedList();
		R=new myLinkedList();
		S=new myLinkedList();
		T=new myLinkedList();
		U=new myLinkedList();
		V=new myLinkedList();
		W=new myLinkedList();
		X=new myLinkedList();
		Y=new myLinkedList();
		Z=new myLinkedList();
		load();
	}
	class searchLoadThread implements Runnable{
	int range;
	Node head;
	Node end;
	myLinkedList A=new myLinkedList();
	myLinkedList B=new myLinkedList();
	myLinkedList C=new myLinkedList();
	myLinkedList D=new myLinkedList();
	myLinkedList E=new myLinkedList();
	myLinkedList F=new myLinkedList();
	myLinkedList G=new myLinkedList();
	myLinkedList H=new myLinkedList();
	myLinkedList I=new myLinkedList();
	myLinkedList J=new myLinkedList();
	myLinkedList K=new myLinkedList();
	myLinkedList L=new myLinkedList();
	myLinkedList M=new myLinkedList();
	myLinkedList N=new myLinkedList();
	myLinkedList O=new myLinkedList();
	myLinkedList P=new myLinkedList();
	myLinkedList Q=new myLinkedList();
	myLinkedList R=new myLinkedList();
	myLinkedList S=new myLinkedList();
	myLinkedList T=new myLinkedList();
	myLinkedList U=new myLinkedList();
	myLinkedList V=new myLinkedList();
	myLinkedList W=new myLinkedList();
	myLinkedList X=new myLinkedList();
	myLinkedList Y=new myLinkedList();
	myLinkedList Z=new myLinkedList();
	@Override
	public void run(){
	while(range>0 && head!=null){
			if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("a"))
				A.add(this.A,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("b"))
				B.add(this.B,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("c"))
				C.add(this.C,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("d"))
				D.add(this.D,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("e"))
				E.add(this.E,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("f"))
				F.add(this.F,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("g"))
				G.add(this.G,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("h"))
				H.add(this.H,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("i"))
				I.add(this.I,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("j"))
				J.add(this.J,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("k"))
				K.add(this.K,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("l"))
				L.add(this.L,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("m"))
				M.add(this.M,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("n"))
				N.add(this.N,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("o"))
				O.add(this.O,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("p"))
				P.add(this.P,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("q"))
				Q.add(this.Q,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("r"))
				R.add(this.R,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("s"))
				S.add(this.S,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("t"))
				T.add(this.T,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("u"))
				U.add(this.U,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("v"))
				V.add(this.V,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("w"))
				W.add(this.W,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("x"))
				X.add(this.X,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("y"))
				Y.add(this.Y,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("z"))
				Z.add(this.Z,head.data);
			head=head.next;
			range--;
		}
		end=head;
	}
		
	
	void setList(Node head,int range){
		this.head=head;
		this.range=range;
	}
	Node getLastNode(){
		return this.end;
	}
	myLinkedList getA(){
	return this.A;}
	
	myLinkedList getB(){
	return this.B;}
	myLinkedList getC(){
	return this.C;}
	myLinkedList getD(){
	return this.D;}
	myLinkedList getE(){
	return this.E;}
	myLinkedList getF(){
	return this.F;}
	myLinkedList getG(){
	return this.G;}
	myLinkedList getH(){
	return this.H;}
	myLinkedList getI(){
	return this.I;}
	myLinkedList getJ(){
	return this.J;}
	myLinkedList getK(){
	return this.K;}
	myLinkedList getL(){
	return this.L;}
	myLinkedList getM(){
	return this.M;}
	myLinkedList getN(){
	return this.N;}
	myLinkedList getO(){
	return this.O;}
	myLinkedList getP(){
	return this.P;}
	myLinkedList getQ(){
	return this.Q;}
	myLinkedList getR(){
	return this.R;}
	myLinkedList getS(){
	return this.S;}
	myLinkedList getT(){
	return this.T;}
	myLinkedList getU(){
	return this.U;}
	myLinkedList getV(){
	return this.V;}
	myLinkedList getW(){
	return this.W;}
	myLinkedList getX(){
	return this.X;}
	myLinkedList getY(){
	return this.Y;}
	myLinkedList getZ(){
	return this.Z;}
}

	void print(myLinkedList list){
		System.out.println("print called");
		Node head=list.head;
		int count=1;
		while(head!=null){
			System.out.println("\n"+count+".");
			count++;
			head.data.getPerson();
			head=head.next;
		}
	}
	void printList(String ch){
		System.out.println("List of contacts whose name Starting from:"+ch.toUpperCase());
		if(ch.toLowerCase().equals("a"))
			print(this.A);
		else if(ch.toLowerCase().equals("b"))
			print(this.B);
		else if(ch.toLowerCase().equals("c"))
			print(this.C);
		else if(ch.toLowerCase().equals("d"))
			print(this.D);
		else if(ch.toLowerCase().equals("e"))
			print(this.E);
		else if(ch.toLowerCase().equals("f"))
			print(this.F);
		else if(ch.toLowerCase().equals("g"))
			print(this.G);
		else if(ch.toLowerCase().equals("h"))
			print(this.H);
		else if(ch.toLowerCase().equals("i"))
			print(this.I);
		else if(ch.toLowerCase().equals("j"))
			print(this.J);
		else if(ch.toLowerCase().equals("k"))
			print(this.K);
		else if(ch.toLowerCase().equals("l"))
			print(this.L);
		else if(ch.toLowerCase().equals("m"))
			print(this.M);
		else if(ch.toLowerCase().equals("n"))
			print(this.N);
		else if(ch.toLowerCase().equals("o"))
			print(this.O);
		else if(ch.toLowerCase().equals("p"))
			print(this.P);
		else if(ch.toLowerCase().equals("q"))
			print(this.Q);
		else if(ch.toLowerCase().equals("r"))
			print(this.R);
		else if(ch.toLowerCase().equals("s"))
			print(this.S);
		else if(ch.toLowerCase().equals("t"))
			print(this.T);
		else if(ch.toLowerCase().equals("u"))
			print(this.U);
		else if(ch.toLowerCase().equals("v"))
			print(this.V);
		else if(ch.toLowerCase().equals("w"))
			print(this.W);
		else if(ch.toLowerCase().equals("x"))
			print(this.X);
		else if(ch.toLowerCase().equals("y"))
			print(this.Y);
		else if(ch.toLowerCase().equals("z"))
			print(this.Z);
		
	}
	void updateList(person node){
		String ch=String.valueOf(node.name.charAt(0));
		if(ch.toLowerCase().equals("a"))
			this.A.add(this.A,node);
		else if(ch.toLowerCase().equals("b"))
			this.B.add(this.B,node);
		else if(ch.toLowerCase().equals("c"))
			this.C.add(this.C,node);
		else if(ch.toLowerCase().equals("d"))
			this.D.add(this.D,node);
		else if(ch.toLowerCase().equals("e"))
			this.E.add(this.E,node);
		else if(ch.toLowerCase().equals("f"))
			this.F.add(this.F,node);
		else if(ch.toLowerCase().equals("g"))
			this.G.add(this.G,node);
		else if(ch.toLowerCase().equals("h"))
			this.H.add(this.H,node);
		else if(ch.toLowerCase().equals("i"))
			this.I.add(this.I,node);
		else if(ch.toLowerCase().equals("j"))
			this.J.add(this.J,node);
		else if(ch.toLowerCase().equals("k"))
			this.K.add(this.K,node);
		else if(ch.toLowerCase().equals("l"))
			this.L.add(this.L,node);
		else if(ch.toLowerCase().equals("m"))
			this.M.add(this.M,node);
		else if(ch.toLowerCase().equals("n"))
			this.N.add(this.N,node);
		else if(ch.toLowerCase().equals("o"))
			this.O.add(this.O,node);
		else if(ch.toLowerCase().equals("p"))
			this.P.add(this.P,node);
		else if(ch.toLowerCase().equals("q"))
			this.Q.add(this.Q,node);
		else if(ch.toLowerCase().equals("r"))
			this.R.add(this.R,node);
		else if(ch.toLowerCase().equals("s"))
			this.S.add(this.S,node);
		else if(ch.toLowerCase().equals("t"))
			this.T.add(this.T,node);
		else if(ch.toLowerCase().equals("u"))
			this.U.add(this.U,node);
		else if(ch.toLowerCase().equals("v"))
			this.V.add(this.V,node);
		else if(ch.toLowerCase().equals("w"))
			this.W.add(this.W,node);
		else if(ch.toLowerCase().equals("x"))
			this.X.add(this.X,node);
		else if(ch.toLowerCase().equals("y"))
			this.Y.add(this.Y,node);
		else if(ch.toLowerCase().equals("z"))
			this.Z.add(this.Z,node);
	}
		
		
	void load(){
	
		Node head=this.contactlist.head;
		/*while(head!=null){
			if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("a"))
				A.add(this.A,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("b"))
				B.add(this.B,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("c"))
				C.add(this.C,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("d"))
				D.add(this.D,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("e"))
				E.add(this.E,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("f"))
				F.add(this.F,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("g"))
				G.add(this.G,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("h"))
				H.add(this.H,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("i"))
				I.add(this.I,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("j"))
				J.add(this.J,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("k"))
				K.add(this.K,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("l"))
				L.add(this.L,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("m"))
				M.add(this.M,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("n"))
				N.add(this.N,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("o"))
				O.add(this.O,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("p"))
				P.add(this.P,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("q"))
				Q.add(this.Q,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("r"))
				R.add(this.R,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("s"))
				S.add(this.S,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("t"))
				T.add(this.T,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("u"))
				U.add(this.U,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("v"))
				V.add(this.V,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("w"))
				W.add(this.W,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("x"))
				X.add(this.X,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("y"))
				Y.add(this.Y,head.data);
			else if(String.valueOf(head.data.name.charAt(0)).toLowerCase().equals("z"))
				Z.add(this.Z,head.data);
			head=head.next;
		}*/

		for(int i=0; i<100; i++){
			searchLoadThread sLT=new searchLoadThread();
			sLT.setList(head,this.range);
			Thread th=new Thread(sLT);
			th.start();
			
			try{
			th.join();}
			catch(Exception e){}
			this.A.extend(sLT.getA());
			this.B.extend(sLT.getB());
			this.C.extend(sLT.getC());
			this.D.extend(sLT.getD());
			this.E.extend(sLT.getE());
			this.F.extend(sLT.getF());
			this.G.extend(sLT.getG());
			this.H.extend(sLT.getH());
			this.I.extend(sLT.getI());
			this.J.extend(sLT.getJ());
			this.K.extend(sLT.getK());
			this.L.extend(sLT.getL());
			this.M.extend(sLT.getM());
			this.N.extend(sLT.getN());
			this.O.extend(sLT.getO());
			this.P.extend(sLT.getP());
			this.Q.extend(sLT.getQ());
			this.R.extend(sLT.getR());
			this.S.extend(sLT.getS());
			this.T.extend(sLT.getT());
			this.U.extend(sLT.getU());
			this.V.extend(sLT.getV());
			this.W.extend(sLT.getW());
			this.X.extend(sLT.getX());
			this.Y.extend(sLT.getY());
			this.Z.extend(sLT.getZ());
			head=sLT.getLastNode();
		}			
	}
	Node findData(myLinkedList list,String name){
		Node head=list.head;
		
		while(head!=null){
			if(head.data.name.equals(name))
				return head;
			head=head.next;
		}
		return null;
	}
	Node search(String name){
		if(String.valueOf(name.charAt(0)).toLowerCase().equals("a"))
			return findData(this.A,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("b"))
			return findData(this.B,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("c"))
			return findData(this.C,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("d"))
			return findData(this.D,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("e"))
			return findData(this.E,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("f"))
			return findData(this.F,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("g"))
			return findData(this.G,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("h"))
			return findData(this.H,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("i"))
			return findData(this.I,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("j"))
			return findData(this.J,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("k"))
			return findData(this.K,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("l"))
			 return findData(this.L,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("m"))
			return findData(this.M,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("n"))
			return findData(this.N,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("o"))
			return findData(this.O,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("p"))
			return findData(this.P,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("q"))
			return findData(this.Q,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("r"))
			return findData(this.R,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("s"))
			return findData(this.S,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("t"))
			return findData(this.T,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("u"))
			return findData(this.U,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("v"))
			return findData(this.V,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("w"))
			return findData(this.W,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("x"))
			return findData(this.X,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("y"))
			return findData(this.Y,name);
		else if(String.valueOf(name.charAt(0)).toLowerCase().equals("z"))
			return findData(this.Z,name);
		else
			return null;
	}
}
class encoder{
	String encode(String text){
		String str="";
		for(int i=0; i<text.length(); i++){
			int val=(int)text.charAt(i);
			//System.out.println(val);
			while(val!=0){
				int digit=val%10;
				str+=String.valueOf(digit);
				val=val/10;
			}
			str+="Z";
		}
	return str;
	}
	String decode(String text){
		String str[]=text.split("Z");
		String pt="";
		for(int i=0; i<str.length; i++){
			String no=str[i];
			String rev="";
			for(int j=no.length()-1; j>=0;j--){
				rev+=no.charAt(j);
			}
			pt+=(char)Integer.parseInt(rev);
	}		
	return pt;
	}
	}		
class person{
	String name,no,email;
	person(String name,String no,String email){
		this.name=name;
		this.no=no;
		this.email=email;
		}
	void getPerson(){
	System.out.print("\tName:-"+this.name+"\n\tMobile No:-"+this.no+"\n\tEmail id:-"+this.email);
	}
	}
class Node{
		person data;
		Node next;
	Node(person d)
		{
		this.data=d;
		this.next=null;
		}
	}
class myLinkedList{
	Node head;
	public myLinkedList add(myLinkedList list,person d){
		if(list.head==null){
			Node head=new Node(d);
			list.head=head;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null){
				last=last.next;
			}
			Node next=new Node(d);
			last.next=next;
		}
		return list;
	}
	public void print(myLinkedList list){
		Node head=list.head;
		int count=1;
		while(head!=null){
				System.out.println("\n"+count+".");
				count++;
				head.data.getPerson();
				head=head.next;
			
		}
	}
	public void extend(myLinkedList list2){
		Node tail=lastNode();
		if(tail!=null)
			tail.next=list2.head;
		else
			this.head=list2.head;
	}
	Node lastNode(){
		if(this.head!=null){
		Node end=this.head;
		while(end!=null){
			if(end.next==null)
				return end;
			end=end.next;
		}
		}
		
		return null;
	}
}
class fileReadThread implements Runnable{
	  private volatile String value="";

     @Override
     public void run() {
     value="";
		
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("db.xyz"),10);
			try
			{
				value=br.readLine();
			}
			catch(Exception e){}
		}

 catch (FileNotFoundException e) {
			
		}
		
     }

     public String getValue() {
         return value;
     }
}
class progressBar implements Runnable{
	String str=">>>loading<<<";
	@Override
	public void run(){
			String load=str;
		char[] val={'>','<'};
		while(true){
		if(load.length()>=50)
			  load=str;
			load=val[0]+load+val[1];
			String data="\r"+load;
			try{
			System.out.write(data.getBytes());
			Thread.sleep(100);
			
			}
			catch(Exception e){}
		}
	}
	void setStr(String str){
		this.str=str;
	}
	String getStr(){
		return this.str;
	}
}
class dataSplitThread implements Runnable{
	myLinkedList contactlist=new myLinkedList();
	String preStrA[];
	int start_index,end_index;
	final encoder en=new encoder();
	final Random rd=new Random();
	@Override
	public void run(){
		
		for(int i=start_index; i<=end_index; i++){
			
			String contactA[]=this.preStrA[i].split(":");
			person p=new person(this.en.decode(contactA[0]),this.en.decode(contactA[1]),this.en.decode(contactA[2]));
			this.contactlist.add(this.contactlist,p);
		}
	}
	void setList(String preStr[],int s,int e){
		this.preStrA=preStr;
		this.start_index=s;
		this.end_index=e;
	}
	myLinkedList getContactList(){
		return this.contactlist;
	}
}
	
	
class dataLoadThread implements Runnable{
		static volatile myLinkedList contactlist=new myLinkedList();
		SearchComponent src;
		encoder en=new encoder();
		int range;
		String readFile(){
		String sttr="";
		try{
		fileReadThread th=new fileReadThread();
		Thread t2=new Thread(th);
		t2.start();
		
		
		t2.join();
		
		sttr=th.getValue();
		
		t2.stop();
		}catch(Exception e){}
		return sttr;
	}
		@Override
		public void run(){
			String preStr="";
			try{
			preStr=readFile();
		if(preStr.length()==0)
			return;
			}
			catch(Exception e){
			return;}
		String[] preStrA=preStr.split("##");
		
		int last_index=preStrA.length-1;
		int size=preStrA.length;
		int start_index=0;
		int end_index=(size/100)-1;
		range=size/100;
		int remender=last_index%100;
			for(int i=0; i<100&& last_index>0;i++){
			
			if(last_index==((size/100)-1)){
				dataSplitThread bt=new dataSplitThread();
				bt.setList(preStrA,start_index,size-1);
				Thread btT=new Thread(bt);
				btT.start();
				try{
					
				btT.join();}catch(Exception e){}
				this.contactlist.extend(bt.getContactList());
				btT.stop();
				last_index-=remender;
			}
			else{
			
				dataSplitThread bt=new dataSplitThread();
				bt.setList(preStrA,start_index,end_index);
				Thread btT=new Thread(bt);
				btT.start();
				try{
					
				btT.join();}catch(Exception e){}
				this.contactlist.extend(bt.getContactList());
				btT.stop();
				start_index=end_index+1;
				end_index=start_index+((size/100)-1);
				last_index-=(size/100);
			}
		}
		System.gc();
		/*for(int i=0; i<preStrA.length; i++){
			
			String contactA[]=preStrA[i].split(":");
			person p=new person(this.en.decode(contactA[0]),this.en.decode(contactA[1]),this.en.decode(contactA[2]));
			this.contactlist.add(this.contactlist,p);
		}*/
		
		this.src=new SearchComponent(this.contactlist,this.range);
		}
		int getRange(){
			return this.range;
		}
		myLinkedList getContactList(){
			return this.contactlist;
		}
		SearchComponent getSearchComponent(){
			return this.src;
		}
}
class PhoneBook{
	myLinkedList contactlist=new myLinkedList();
	final Scanner sc=new Scanner(System.in);
	final encoder en=new encoder();
	SearchComponent src;
	progressBar bar=new progressBar();
	final Thread t1=new Thread(bar);
	int range;
	PhoneBook(){
		config();
		if(auth()){
		this.t1.start();
		load();
		updateDb();
		this.t1.stop();
		}
		else{
			System.out.println("Authentication Failed!!!");
			System.exit(1);
		}
	}
	void config(){
		try{
			FileReader fr=new FileReader("config.xyz");
		}
		catch(FileNotFoundException e){
			try{
			FileWriter fw=new FileWriter("config.xyz");
			String default_pass=this.en.encode("Soumya");
			fw.write(default_pass);
			fw.close();}
			catch(Exception ez){}
		}
		}
			
	void forget(){
		System.out.println("\t\tSecurity Question\nWhat is your name?");
		String name=this.sc.nextLine();
		
			System.out.println("Enter new Password");
			String newP=this.sc.nextLine();
			try{
			FileWriter fw=new FileWriter("config.xyz");
			String default_pass=this.en.encode(name+":"+newP);
			fw.write(default_pass);
			fw.close();
			System.out.println("Password Changed Sucessfully");
			System.exit(1);}
			catch(Exception ez){}
			
		
	}
				
			
			
			
	boolean auth(){
		System.out.println("\t\t_W           E_");
		System.out.println("\t\t_  E       M  _");
		System.out.println("\t\t_    L   O    _");
		System.out.println("\t\t_      C      _");
		String sttr=this.en.decode(readUserData());
		if(sttr.split(":").length>1)
			System.out.println("\tHi "+sttr.split(":")[0]+",Please Enter your Password to continue:-");
		else{
			System.out.println("Please Enter your Password to continue:-");
			System.out.println("\tDefault Pass:-'Soumya',Or Enter 1 to reset password:-");
		}
		String pass=this.sc.nextLine();
		if(pass.equals("1")){
			forget();
		}
		else{
					
		if(sttr.split(":").length>1)
		{
			if(sttr.split(":")[1].equals(pass))
			{
				return true;	
			}
		}
		else if(pass.equals("Soumya"))
		{
			return true;
		}
		}
		return false;
	}
		
	String readUserData(){
		String sttr="";
		try{
			FileReader fr=new FileReader("config.xyz");
			
			int i;
			while((i=fr.read())!=-1){
				
				sttr+=(char)i;
			}
			
		}
		catch(Exception ez){
		}
		return sttr;
	}
	void load(){
		try{
		dataLoadThread dLT=new dataLoadThread();
		Thread dLThread=new Thread(dLT);
		dLThread.start();
		dLThread.join();
		this.contactlist=dLT.getContactList();
		this.src=dLT.getSearchComponent();
		this.range=dLT.getRange();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	String readFile(){
		String sttr="";
		try{
		fileReadThread th=new fileReadThread();
		Thread t2=new Thread(th);
		t2.start();
		this.t1.start();
		
		t2.join();
		
		sttr=th.getValue();
		
		t2.stop();
		}catch(Exception e){}
		return sttr;
	}
	void updateDb(){
		
		try{
			FileWriter fw=new FileWriter("db.xyz");
			Node head=this.contactlist.head;
			int count=1;
			
			while(head!=null){
			
				
				count++;
				fw.write(this.en.encode(head.data.name)+":"+this.en.encode(head.data.no)+":"+this.en.encode(head.data.email));
				fw.write("##");
				head=head.next;
			
		}
		
		fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("\nDatabase Updated");
			
	}

	void add(){
		System.out.println("Please provide necessary information to save your contact:-");
		System.out.println("Enter Name:-");
		String name=this.sc.nextLine();
		System.out.println("Enter Mobile No:-");
		String no=this.sc.nextLine();
		System.out.println("Enter Email Address:-");
		String email=this.sc.nextLine();
		if(noAvailable(no)){
			System.out.println("No is already saved in db try searching using no as keyward");
		}
		else{
		person p=new person(name,no,email);
		this.contactlist.add(this.contactlist,p);
		System.out.println("\nSuccessfully Added 1 person named "+name+".");
		try{
		this.src.updateList(p);
		}
		catch(NullPointerException e){
			this.src=new SearchComponent(this.contactlist,this.range);
		}
		}
	}
	boolean noAvailable(String no){
		Node head=this.contactlist.head;
		int count=1;
		while(head!=null){
				if(no.equals(head.data.no))
					return true;
				head=head.next;
			
		}
		return false;
	}
	void view(){
		this.contactlist.print(this.contactlist);
	}
	void search(){
		
		System.out.println("Enter Name:-");
		String name=this.sc.nextLine();
		Node x=this.src.search(name);
		if(x!=null){
			System.out.println("\tName:-"+x.data.name+"\n\tMobile No:-"+x.data.no+"\n\tEmail id:-"+x.data.email);
		}
		else
			System.out.println("Not Found!!!Try Again!!!");
		
		
	}
	void update(){
		System.out.println("Enter the name whose contact details you want to update:-");
		String name=this.sc.nextLine();
		Node x=this.src.search(name);
		if(x!=null){
			System.out.println("Choose an option:-");
			String N,No,E;
			System.out.println("Want to update Name?(Ans Y or N)");
			N=this.sc.nextLine();
			if(N.toLowerCase().equals("y")){
				System.out.println("Enter updated name:-");
				x.data.name=this.sc.nextLine();
			}
			System.out.println("Want to update Mobile No?(Ans Y or N)");
			No=this.sc.nextLine();
			if(No.toLowerCase().equals("y")){
				System.out.println("Enter updated Mobile No:-");
				x.data.no=this.sc.nextLine();
			}
			System.out.println("Want to update Email?(Ans Y or N)");
			E=this.sc.nextLine();
			if(E.toLowerCase().equals("y")){
				System.out.println("Enter updated Email:-");
				x.data.email=this.sc.nextLine();
			}
		}
		else
			System.out.println("Not Found!!!Try Again!!!");
		
		
	}
	void  viewAlphabetically(){
		System.out.println("Enter the Alphabate to show contacts list under that alphabate:-ex:a or ex:b");
				String ch=this.sc.nextLine();
				this.src.printList(ch);
	}
	public static void main(String args[])
	{
		PhoneBook app=new PhoneBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Contact List:-(Choose one of the option below)");
		System.out.println("\n1.View Contacts\n2.Add Contact\n3.Search Contact\n4.Update Contact\n5.Run the Bot\n6.View Contacts As Per Alphabate\n7.Exit");
		int opt=sc.nextInt();
		while(opt!=7){
			if(opt==1){
				app.view();
				System.out.println();
			}
			else if(opt==2){
				app.add();
				System.out.println();
			}
			else if(opt==3){
				app.search();
				System.out.println();
			}
			else if(opt==4){
				app.update();
				System.out.println();
			}
			else if(opt==5){
				System.out.println("bot called");
				bot bt=new bot();
				bt.runBot();
		
		
			}
			else if(opt==6){
				app.viewAlphabetically();
				System.out.println();
				
			}
			else{
				System.out.println("Invalid Option");
			}
			System.out.println("1.View Contacts\n2.Add Contact\n3.Search Contact\n4.Update Contact\n5.Run bot to add dummy contacts\n6.View Contacts As Per Alphabate\n7.Exit");
			opt=sc.nextInt();
		}
		if(opt==7){
			app.updateDb();
			System.exit(1);
		}
	}
}
class bot{
		myLinkedList contactlist=new myLinkedList();
		final encoder en=new encoder();
		final Scanner sc=new Scanner(System.in);
		final Random rd=new Random();
		void updateDb(){
		try{
			FileWriter fw=new FileWriter("db.xyz");
			Node head=this.contactlist.head;
			int count=1;
			while(head!=null){
				
				count++;
				fw.write(this.en.encode(head.data.name)+":"+this.en.encode(head.data.no)+":"+this.en.encode(head.data.email));
				fw.write("##");
				head=head.next;
																					
		}
		fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Successfully updated to database");
			
	}
	
	void runBot()
	{	
		System.out.println("!!!CAUTION ALL YOUR PREVIOUS LIST WILL BE DELETED!!! \nNo of random contact you wnat to add(Multi-Thread Execution):-");
		int no=this.sc.nextInt();
		int Nno=no;
		int remender=no%100;
		int val=no/100;
		progressBar br=new progressBar();
		br.setStr(">>>....Generating....<<<");
		Thread th=new Thread(br);
		th.start();
		for(int i=0; i<100&& no>0;i++){
			
			if(no==val){
				BotThread bt=new BotThread();
				bt.setRange(no);
				Thread btT=new Thread(bt);
				btT.start();
				try{
					System.out.println(btT.getName()+"Running...");
				btT.join();}catch(Exception e){}
				this.contactlist.extend(bt.getContactList());
				btT.stop();
				no-=remender;
			}
			else{
			BotThread bt=new BotThread();
				bt.setRange(val);
				Thread btT=new Thread(bt);
				btT.start();
				try{
					System.out.println(btT.getName()+"Running...");
				btT.join();}catch(Exception e){}
				this.contactlist.extend(bt.getContactList());
				btT.stop();
				no-=val;
			}
		}
		/*while(no-->0){
			String n=RandomName();
			String n_o=randomMobileNo();
			String e=randomAlphanumeric();
			System.out.println("n="+n+"\nn_o="+n_o+"\ne=="+e);
			person p=new person(n,n_o,e);
			this.contactlist.add(this.contactlist,p);
		}*/
		th.stop();
		this.updateDb();
		System.out.println("Successfully added "+Nno+" dummy contacts to the db");
		System.exit(1);
		
	}
}
class BotThread implements Runnable{
	int range;
	final encoder en=new encoder();
	final Scanner sc=new Scanner(System.in);
	final Random rd=new Random();
	myLinkedList contactlist=new myLinkedList();
	String randomAlphanumeric(){
		char[] UC={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] lc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] ns={'1','2','3','4','5','6','7','8','9','0'};
		int size=16;
		int at=8;
		int dt=3;
		String email="";
		while(size-->0){
			if(size==at){
				email+="@";
			}
			else if(size==dt){
				email+=".";
			}
			else{
			int index=this.rd.nextInt(25);
			email+=lc[index];
			}
		}
		return email;
	}
	String RandomName(){
	char[] UC={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] lc={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int size=this.rd.nextInt(5);
		String name="";
		if(size==0){
			size=3;
		}
		int start=size;
		while(size-->0){
			if (size==start){
				name+=UC[this.rd.nextInt(25)];
			}
			else{
				name+=lc[this.rd.nextInt(25)];
			}
		}
	return name;}
	String randomMobileNo()
	{
		char[] ns={'1','2','3','4','5','6','7','8','9','0'};
		int size=10;
		String no="";
		while(size-->0){
			int index=this.rd.nextInt(9);
			no+=ns[index];
		}
		return no;
	}
	
	@Override
	public void run(){
		while(this.range-->0){
		String n=RandomName();
			String n_o=randomMobileNo();
			String e=randomAlphanumeric();
			
			person p=new person(n,n_o,e);
			this.contactlist.add(this.contactlist,p);
		}
	}
	void setRange(int val){
		this.range=val;
	}
	myLinkedList getContactList(){
		return this.contactlist;
	}
}
	
		
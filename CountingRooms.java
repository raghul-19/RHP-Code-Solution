	import java.util.*;
	
	class CountingRooms {
		public static void main(String a[]) {
			
			Scanner in=new Scanner(System.in);
			int m=in.nextInt();
			int n=in.nextInt();
			char ch[][]=new char[m][n];
			for(int i=0; i<m; i++) {
				ch[i]=in.next().toCharArray();
			}
			
			long count=0;
			long length=0;
			int track=0;
			int[] des={-1,-1};
			int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
			String path="DURL";
			int loopBreak=0;
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(ch[i][j]!='A') continue;
					Queue<int[]> queue=new LinkedList<>();
					queue.add(new int[]{i,j});
					while(!queue.isEmpty()) {
						int s=queue.size();
						for(int k=0; k<s; k++) {
							int[] temp=queue.peek();
							int row=temp[0]; int col=temp[1];
							for(int l=0; l<path.length(); l++) {
								int r=row+dir[l][0];
								int c=col+dir[l][1];
								if(r>=0 && c>=0 && r<ch.length && c<ch[0].length && (ch[r][c]=='.' || ch[r][c]=='B')) {
									if(ch[r][c]=='B') {
									  	ch[r][c]=path.charAt(l);
										des[0]=r;
										des[1]=c;
										length=count+1;
										track++;
										break;
									}

									ch[r][c]=path.charAt(l);
									queue.add(new int[]{r,c});
	
								}
							}
							if(track!=0) break;
							queue.poll();
							
							
						}
						if(track!=0) break;
						count++;
	
						 
					}
					
					loopBreak++;
					break;
				}
				if(loopBreak!=0) break;
			}
			if(des[0]==-1) {
				System.out.println("NO");return;
			}
			
			int r=des[0]; int c=des[1];
			StringBuilder sb=new StringBuilder("");
			while(ch[r][c]!='A') {
				sb.append(ch[r][c]);
				int index=path.indexOf(ch[r][c]);
				r=r-dir[index][0];
				c=c-dir[index][1];
			}
			System.out.print("YES\n"+length+"\n"+sb.reverse().toString());
			
		}
		
	}
#include<stdio.h>
void dfs(int);
void push(int);
int pop();
int stack[20],noVertices;
int top=0;
int adjacencyMatrix [20][20];
int vis[20];
int main(){
    int i,j,option;
    printf("Enter the no. of vertices\n");
    scanf("%d",&noVertices);
    printf("For getting adjacency matrix\n");
    for(i=1;i<=noVertices;i++){
        for(j=1;j<=noVertices;j++){
            printf("press 1 if %d has edge with %d Else 0 :- ",i,j);
            scanf("%d",&adjacencyMatrix[i][j]);
        }
    }
    printf("Your adjacency matrix is :- \n");
    for(i=1;i<=noVertices;i++){
        for(j=1;j<=noVertices;j++){
            printf("%d\t",adjacencyMatrix[i][j]);
        }
        printf("\n");
    }
    for(i=1;i<=noVertices;i++){
        vis[i]==1;
    }
    do{
        printf("\n Enter your choice \n");
        printf("1.DFS\n2.BFS\n3.Exit\n");
        scanf("%d",&option);
        switch (option){
            case 1 :
                dfs(1);
                break;
            default :
                printf("Choose a correct option");
        }

    }while(option!=3);
    
    return 0;
}
void dfs(int source){
    int temp,i;
    push(source);
    vis[source]=0;
    temp=pop();
    if(temp!=0){
        printf(" %d ",temp);
    }
    
    while(top!=-1){
            for(i=1;i<=noVertices;i++){
                if(adjacencyMatrix[temp][i]!=0 && vis[i]==1);
                    push(i);
                    vis[i]=0;
            }
        temp=pop();
        if(temp!=0){
        printf(" %d ",temp);
    }
    }
    for(i=1;i<=noVertices;i++){
        if(vis[i]==1){
            dfs(i);
        }
    }
}
void push(int item){
    if(top==20)
            printf("Stack overflow ");
    else
    stack[++top]=item;
}
int pop(){
    int k;
    if(top==-1)
    return(0);
    else{
    k=stack[top--];
    return(k);
    }
}
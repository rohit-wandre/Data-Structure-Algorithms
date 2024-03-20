#include <stdio.h>
int main()
{
    struct node
    {
        int data;
        struct node *next;
    };
    
    struct node *head=NULL,*temp,*newnode=NULL;
    int choice;
    do
    {
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->next=NULL;
    printf("enter data");
    scanf("%d",&newnode->data);
    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
    }
    else
    {
        temp->next=newnode;
        temp=newnode;
    }
    printf("do you want to continue(0,1)?");
    scanf("%d",&choice);
    }while(choice==1);
    
    temp=head;
    while(temp!=NULL)
    {
        printf("%d->",temp->data);
        temp=temp->next;
    }
    
    return 0;
}

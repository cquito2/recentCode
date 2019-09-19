//================================================================
//Carlos Quito
// Stack interface 
//interface class obtained from Object Oriented Data Structures 3e
//=================================================================
public interface StackInterface<T> 
{
void pop() throws StackUnderflowException ; 
//II Throws StcckUnderflowException if this stack is empty. 
//II otherwise removes top element from this stack. 
T top() throws StackUnderflowException; 
//II Throws StackUnderflowException if this stack is empty,
// II otherwise returns top element from this stack

boolean isEmpty(); 

//II Returns true if this stack is empty. otherwi se returns f alse 

}
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    // Special case...
    if(head == NULL || head->next == NULL)  return head;
    // Initialize prev pointer as the head...
    struct ListNode* prev = head;
    // Initialize curr pointer as the next pointer of prev...
    struct ListNode* curr = prev->next;
    // Initialize next of head pointer as NULL...
    head->next = NULL;
    // Run a loop till curr and prev points to NULL...
    while(prev != NULL && curr != NULL){
        // Initialize next pointer as the next pointer of curr...
        struct ListNode* next = curr->next;
        // Now assign the prev pointer to curr’s next pointer.
        curr->next = prev;
        // Assign curr to prev, next to curr...
        prev = curr;
        curr = next;
    }
    return prev;    // Return the prev pointer to get the reverse linked list...
}
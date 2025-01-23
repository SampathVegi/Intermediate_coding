/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// Function to find the middle node of the linked list
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* slow = head; // Slow pointer
    struct ListNode* fast = head; // Fast pointer

    // Traverse the list: fast moves 2 steps, slow moves 1 step
    while (fast != NULL && fast->next != NULL) {
        fast = fast->next->next;  // Move fast pointer 2 steps
        slow = slow->next;        // Move slow pointer 1 step
    }

    // When fast pointer reaches the end, slow is at the middle
    return slow;
}

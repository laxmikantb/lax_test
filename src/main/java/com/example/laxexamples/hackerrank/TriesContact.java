import java.util.HashMap;
import java.util.Scanner;

public class TriesContact {
	public static class TrieNode {
		private static int NUMBER_OF_CHARACTERS = 26;
		
        private TrieNode parent;
        private TrieNode[] children;
        private boolean isLeaf; //Quick way to check if any children exist
        private boolean isWord; //Does this node represent the last character of a word
        private char character; //The character this node represents
        private int count;


        public TrieNode() {
           children = new TrieNode[NUMBER_OF_CHARACTERS];
           isLeaf = true;
           isWord = false;
           count = 0;
        }

        public TrieNode(char character) {
            this();
            this.character = character;
            this.count = 1;
        }

        protected void addWord(String word) {
            isLeaf = false;
            int charPos = word.charAt(0) - 'a';

            if (children[charPos] == null) {
                children[charPos] = new TrieNode(word.charAt(0));
                children[charPos].parent = this;
            } else {
                children[charPos].count++;
            }

            if (word.length() > 1) {
                children[charPos].addWord(word.substring(1));
            } else {
                children[charPos].isWord = true;
            }
        }

        protected int findCount(String word) {
            int charPos = word.charAt(0) - 'a';

            if ((word.length() == 1) && (children[charPos] != null)) {
                return children[charPos].count;
            } else if (children[charPos] == null)
                return 0;
            else
                return children[charPos].findCount(word.substring(1));
        }

        protected TrieNode getNode(char c) {
           return children[c - 'a'];
       }
   }

    public static class Trie {
        private TrieNode root;
        public Trie() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            root.addWord(word.toLowerCase());
        }

        public int findCount(String word) {
          if (word.length() == 0)
            return 0;
        else
            return root.findCount(word.toLowerCase());
       }
   }
    
    
	public static void main(String[] args) {
		Trie t = new Trie();
		int count =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add"))
            {
            	t.addWord(contact);
            }
            else
            	if (op.equals("find")) {
            		count = t.findCount(contact);
            		System.out.println(count);
            	}
        }

	}

}

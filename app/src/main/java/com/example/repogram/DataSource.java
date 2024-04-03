package com.example.repogram;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Account> accounts = generateDummyAccounts();

    private static ArrayList<Account> generateDummyAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("medievalhistoryart", "1.465", "228RB", "98", R.drawable.profile_medievalhistoryart_pp, R.drawable.profile_medievalhistoryart_post1, R.drawable.profile_medievalhistoryart_post2, R.drawable.profile_medievalhistoryart_post3, R.drawable.profile_medievalhistoryart_post4, null, null, null, null, null, R.drawable.profile_medievalhistoryart_story));
        accounts.add(new Account("redmatthew2", "244", "1.912", "1.206", R.drawable.profile_redmatthew2_pp, R.drawable.profile_redmatthew2_post1, R.drawable.profile_redmatthew2_post2, R.drawable.profile_redmatthew2_post3, null, null, null, null, null, null, R.drawable.profile_redmatthew2_story));
        accounts.add(new Account("the.crusader.returns", "315", "31,2RB", "4466", R.drawable.profile_crusaderreturn_pp, R.drawable.profile_redmatthew2_post1, R.drawable.profile_redmatthew2_post2, R.drawable.profile_redmatthew2_post3, null, null, null, null, null, null, R.drawable.profile_redmatthew2_story));
        accounts.add(new Account("zvipey", "3", "53", "55", R.drawable.profile_zvipey_pp, R.drawable.profile_zvipey_post1, R.drawable.profile_zvipey_post2, null, null, null, null, null, null, null, R.drawable.profile_zvipey_story));
        accounts.add(new Account("bringmethehorizon", "982", "3,6JT", "11", R.drawable.profile_bmth_pp, R.drawable.profile_bmth_post1, R.drawable.profile_bmth_post2, R.drawable.profile_bmth_post3, null, null, null, null, null, null, R.drawable.profile_bmth_story));
        accounts.add(new Account("ammartyo", "4", "1.932", "702", R.drawable.profile_ammar_pp, R.drawable.profile_ammar_post1, R.drawable.profile_ammar_post2, R.drawable.profile_ammar_post3, null, null, null, null, null, null, R.drawable.profile_ammar_story));
        accounts.add(new Account("piscok.png", "24", "7", "5", R.drawable.profile_fahri_pp, R.drawable.profile_fahri_post1, null, null, null, null, null, null, null, null, R.drawable.profile_fahri_story));
        return accounts;
    }
}
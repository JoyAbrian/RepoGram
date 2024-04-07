package com.example.repogram;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Account> accounts = generateDummyAccounts();

    private static ArrayList<Account> generateDummyAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("jorantepasang", "5", "538", "528", R.drawable.profile_anonym, R.drawable.profile_joyrantepasang_post1, R.drawable.profile_joyrantepasang_post2, R.drawable.profile_joyrantepasang_post3, R.drawable.profile_joyrantepasang_post4, null, null, null, null, null, R.drawable.profile_joyrantepasang_story));
        accounts.add(new Account("medievalhistoryart", "1.465", "228RB", "98", R.drawable.profile_medievalhistoryart_pp, R.drawable.profile_medievalhistoryart_post1, R.drawable.profile_medievalhistoryart_post2, R.drawable.profile_medievalhistoryart_post3, R.drawable.profile_medievalhistoryart_post4, null, null, null, null, null, R.drawable.profile_medievalhistoryart_story));
        accounts.add(new Account("redmatthew2", "244", "1.912", "1.206", R.drawable.profile_redmatthew2_pp, R.drawable.profile_redmatthew2_post1, R.drawable.profile_redmatthew2_post2, R.drawable.profile_redmatthew2_post3, null, null, null, null, null, null, R.drawable.profile_redmatthew2_story));
        accounts.add(new Account("zvipey", "3", "53", "55", R.drawable.profile_zvipey_pp, R.drawable.profile_zvipey_post1, R.drawable.profile_zvipey_post2, null, null, null, null, null, null, null, R.drawable.profile_zvipey_story));
        accounts.add(new Account("bringmethehorizon", "982", "3,6JT", "11", R.drawable.profile_bmth_pp, R.drawable.profile_bmth_post1, R.drawable.profile_bmth_post2, R.drawable.profile_bmth_post3, null, null, null, null, null, null, R.drawable.profile_bmth_story));
        accounts.add(new Account("ammartyo", "4", "1.932", "702", R.drawable.profile_ammar_pp, R.drawable.profile_ammar_post1, R.drawable.profile_ammar_post2, R.drawable.profile_ammar_post3, null, null, null, null, null, null, R.drawable.profile_ammar_story));
        accounts.add(new Account("piscok.png", "24", "7", "5", R.drawable.profile_fahri_pp, R.drawable.profile_fahri_post1, null, null, null, null, null, null, null, null, R.drawable.profile_fahri_story));
        accounts.add(new Account("faithfulchosen", "2.594", "31,6RB", "1.887", R.drawable.profile_faithfulchosen_pp, R.drawable.profile_faithfulchosen_post1, R.drawable.profile_faithfulchosen_post2, R.drawable.profile_faithfulchosen_post3, R.drawable.profile_faithfulchosen_post4, null, null, null, null, null, R.drawable.profile_faithfulchosen_story));
        accounts.add(new Account("gtaleaks", "2.843", "280RB", "11", R.drawable.profile_gtaleaks_pp, R.drawable.profile_gtaleaks_post1, R.drawable.profile_gtaleaks_post2, R.drawable.profile_gtaleaks_post3, R.drawable.profile_gtaleaks_post4, R.drawable.profile_gtaleaks_post5, R.drawable.profile_gtaleaks_post6, R.drawable.profile_gtaleaks_post7, null, null, R.drawable.profile_gtaleaks_story));
        accounts.add(new Account("ethansrosaries", "2.159", "4.592", "1.722", R.drawable.profile_ethansrosaries_pp, R.drawable.profile_ethansrosaries_post1, R.drawable.profile_ethansrosaries_post2, R.drawable.profile_ethansrosaries_post3, R.drawable.profile_ethansrosaries_post4, R.drawable.profile_ethansrosaries_post5, null, null, null, null, R.drawable.profile_ethansrosaries_story));
        accounts.add(new Account("anchienthistoryart", "1.387", "129RB", "130", R.drawable.profile_anchienthistoryart_pp, R.drawable.profile_anchienthistoryart_post1, R.drawable.profile_anchienthistoryart_post2, R.drawable.profile_anchienthistoryart_post3, R.drawable.profile_anchienthistoryart_post4, R.drawable.profile_anchienthistoryart_post5, R.drawable.profile_anchienthistoryart_post6, R.drawable.profile_anchienthistoryart_post7, null, null, R.drawable.profile_anchienthistoryart_story));
        accounts.add(new Account("annabel.lucinda", "151", "3JT", "154", R.drawable.profile_anabellucinda_pp, R.drawable.profile_anabellucinda_post1, R.drawable.profile_anabellucinda_post2, R.drawable.profile_anabellucinda_post3, R.drawable.profile_anabellucinda_post4, R.drawable.profile_anabellucinda_post5, R.drawable.profile_anabellucinda_post6, R.drawable.profile_anabellucinda_post7, R.drawable.profile_anabellucinda_post8, R.drawable.profile_anabellucinda_post9, R.drawable.profile_anabellucinda_story));
        return accounts;
    }
}
package com.possibleworlds.aphorisms;

import java.util.Random;

/**
 * Created by David Lu on 7/29/2015.
 */
public class AphorismBook {

    // Member fields (properties)
    private String [] mAphorisms = {
            "It is morally wrong to allow suckers to keep their money. Addendum; a Smith and Wesson beats four aces.",
            "A pipe gives a wise man time to think. And a fool something to put in his mouth.",
            "Never underestimate the power of human stupidity.",
            "Whatever goes around, comes around.",
            "There is only one right way for a machine to run.  The number of ways it can go wrong is so infinite that every operating engineer lives in constant terror.",
            "If you don't like yourself, you can't like other people.",
            "Money is a powerful aphrodisiac.  But flowers work almost as well",
            "It may be better to be a live jackal than a dead lion, but it is better still to be a live lion.  And usually easier.",
            "Men rarely, if ever, manage to dream up a god superior to themselves.  Most gods have the morals and manners of a spoiled child.",
            "Place your clothes and weapons where you can find them in the dark.",
            "An Elephant;  A Mouse built to government specifications.",
            "Democracy is based on the assumption that a million men are wiser than one man. How's that again?  I missed something.",
            "Autocracy is based on the assumption that one man is wiser than a million men.  Let's play that over again too.  Who decides?",
            "Taxes are not levied for the benefit of the taxed.",
            "Money is the sincerest form of flattery. Women love to be flattered. So do men.",
            "You live and learn.  Or you don't live long.",
            "Only a sadistic scoundrel - or a fool - tells the bald truth on social occasions.",
            "Be wary of strong drink.  It can make you shoot at tax collectors - and miss.",
            "A man does not insist on physical beauty in a woman who builds up his morale.  After a while he realizes that she *is* beautiful - he just hadn't noticed at first.",
            "Natural laws have no pity.",
            "Sin lies only in hurting other people unnecessarily.  All other 'sins' are invented nonsense.  (Hurting yourself is not sinful - just stupid.)",
            "Certainly the game is rigged.  Don't let that stop you.  If you don't bet, you can't win.",
            "Delusions are often functional.  A mother's opinions about her children's beauty, intelligence, goodness, et cetera ad nauseam, keep her from drowning them at birth.",
            "Never appeal to a man's better nature.  He may not have one. Invoking his self-interest gives you more leverage.",
            "You can have peace,  or you can have freedom.  Don't ever count on having both at once.",
            "Stupidity is not a sin.  The victim can't help being stupid. Stupidity cannot be cured with money, or through education, or by legislation.  But stupidity is the only universal capital crime. The sentence is death;  there is no appeal, and execution is carried out automatically and without pity.",
            "The correct way to punctuate a sentence that starts 'Of course it's none of my business but...' is to place a period after the word 'but'.  Don't use excessive force in supplying such morons with a period.  Cutting his throat is only a momentary pleasure and is bound to get you talked about.",
            "Formal courtesy between husband and wife is even more important than it is between strangers.",
            "Your friends will know you better in the first minute you meet then your acquaintances will know you in a thousand years.",
            "Argue for your limitations and, sure enough, they're yours.",
            "You are never given a wish without also being given the power to make it come true.  You may have to work for it though.",
            "Here is a test to find out whether your mission on earth is finished;  If you're alive, it isn't.",
            "In order to live free and happily, you must sacrifice boredom. It is not always an easy sacrifice.",
            "There is no limit to how gently you can apply a big hammer, but there definitely is to how hard you can hit with a small one.",
            "Let he who doubts the existence of God observe the workings of our Government, then ponder the fact that mankind survives and prospers."
    };
    // Member methods (behaviors)
    public String getAphorism() {

        String aphorism = "";   // Initialize to empty string
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mAphorisms.length);
        if(randomNumber >= 0 && randomNumber < mAphorisms.length){
            aphorism = mAphorisms[randomNumber];
        }
        else {
            aphorism = "An error has occurred!";
        }
        return aphorism;
    }
}

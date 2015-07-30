package com.possibleworlds.aphorisms;

import java.util.Random;

/**
 * Created by David Lu on 7/29/2015.
 */
public class AphorismBook {


    // Member fields (properties)
    private int aphorismNumber = -1;
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
            "An Elephant;\nA Mouse built to government specifications.",
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
            "Let he who doubts the existence of God observe the workings of our Government, then ponder the fact that mankind survives and prospers.",
            "Do not argue with an idiot. He will drag you down to his level and beat you with experience.",
            "To steal ideas from one person is plagiarism. To steal from many is research.",
            "Money can't buy happiness, but it sure makes misery easier to live with.",
            "If you don't control your mind, someone else will.",
            "Not everything that is faced can be changed, but nothing can be changed until it is faced.",
            "When one door closes another door opens; but we often look so long and so regretfully upon the closed door that we do not see the ones which open for us.",
            "Time is a great teacher, but unfortunately it kills all its pupils.",
            "The only thing necessary for the triumph of evil is for good men to do nothing.",
            "The optimist proclaims we live in the best of all possible worlds; and the pessimist fears this is true.",
            "Never mistake knowledge for wisdom. One helps you make a living; the other helps you make a life.",
            "Be wiser than other people, if you can, but do not tell them so.",
            "He who asks is a fool for five minutes, but he who does not ask remains a fool forever.",
            "He who knows does not speak; he who speaks does not know.",
            "Politicians should read science-fiction, not westerns and detective stories.",
            "When you have nothing to say, say nothing.",
            "Censorship always defeats it own purpose, for it creates in the end the kind of society that is incapable of exercising real discretion.",
            "Dream as if you'll live forever. Live as if you'll die tomorrow.",
            "Restriction of free thought and free speech is the most dangerous of all subversions.",
            "The thing that impresses me most about America is the way parents obey their children.",
            "Great spirits have always encountered violent opposition from mediocre minds",
            "Two things are infinite: The universe and human stupidity; and I'm not sure about the universe.",
            "The important thing is not to stop questioning.",
            "Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.",
            "It's all mind over matter. If you don't mind, it doesn't matter.",
            "An election is coming. Universal peace is declared, and the foxes have a sincere interest in prolonging the lives of the poultry.",
            "Imitation is suicide, envy is ignorance.",
            "Infancy conforms to nobody: all conform to it, so that one babe commonly makes four or five out of the adults who prattle and play to it.",
            "Whosoever would be a man must be a nonconformist.",
            "Our greatest glory is not in never failing, but in rising up every time we fail.",
            "Millions long for immortality but do not know what to do with themselves on a rainy Sunday afternoon.",
            "Talk sense to a fool and he calls you foolish.",
            "Any fool can criticise, condemn, and complain, and most fools do.",
            "Whoever would overthrow the liberty of a nation must begin by subduing the freeness of speech.",
            "The world is full of willing people; some willing to work, the rest willing to let them.",
            "Freedom is not worth having if it does not include the freedom to make mistakes. Always.",
            "An eye for an eye leaves the world blind.",
            "Silence is an argument carried on by other means.",
            "Where they have burned books, they will end in burning human beings.",
            "When people talk, listen completely. Most people never listen.",
            "Older men declare war. But it is youth that must fight and die.",
            "Maybe this world is another planet's Hell.",
            "Experience is not what happens to you. It is what you do with what happens to you.",
            "You should never have your best trousers on when you turn out to fight for freedom and truth.",
            "Many people say it is insane to resist the system but it is actually insane not to.",
            "The first casualty when war comes is truth.",
            "Those who make peaceful revolution impossible will make violent revolution inevitable.",
            "Only those who dare to fail greatly can ever achieve greatly.",
            "People demand freedom of speech as a compensation for the freedom of thought which they never use.",
            "In the end, we will remember not the words of our enemies, but the silence of our friends.",
            "In a mad world, only the mad are sane.",
            "Happiness is not something you experience, it is something you remember.",
            "New opinions are always suspected, and usually opposed, without any other reason but because they are not already common.",
            "If we could read the secret history of our enemies we should find in each man's life sorrow and suffering enough to disarm all hostility.",
            "Censorship, like charity, should begin at home; but unlike charity, it should end there.",
            "Don't gain the world for the price of your soul, wisdom is better than silver and gold.",
            "Reason has always existed, but not always in a reasonable form.",
            "Misery motivates, not utopia.",
            "You probably wouldn't worry about what people think of you if you could know how seldom they do.",
            "There is no conversation more boring than the one where everybody agrees.",
            "No man, however great, is known to everybody and no man, however solitary, is known to nobody.",
            "Always question the authority.",
            "You have not converted a man because you have silenced him.",
            "Whoever fights monsters should see to it that in the process he doesn't become a monster.",
            "The optimist thinks that this is the best of all possible worlds, and the pessimist knows it.",
            "Who controls the past controls the future; Who controls the present controls the past.",
            "Its not what I had feared, but what I had not thought to fear",
            "The classroom is the last room to get the truth.",
            "Courage is not the absence of fear, but rather the judgement that something else is more important than fear.",
            "Diplomacy is the art of saying »nice doggy« until you can find a rock.",
            "Yes, I know my enemies, they're the teachers who taught me to fight me: Compromise, Conformity, Assimilation, Submission, Ignorance, Hypocrisy, Brutality, the Elite, all of which are American Dreams.",
            "Remember, no one can make you feel inferior without your consent.",
            "People who know little are usually great talkers, while men who know much say little.",
            "Death is more universal than life; everyone dies but not everyone lives.",
            "Assassination is the extreme form of censorship.",
            "Liberty means responsibility. That is why most men dread it.",
            "Those who fail to learn from history are doomed to repeat it.",
            "I like nonsense, it wakes up the brain cells. Fantasy is a necessary ingredient in living, it's a way of looking at life through the wrong end of a telescope and that enables you to laugh at life's realities.",
            "Unless someone like you cares a whole awful lot, nothing is going to get better, it's not.",
            "It is not what you look at, but what you see.",
            "If you can't convince them, confuse them.",
            "If you do not understand my words, you will not understand my silence.",
            "Think for yourselves and let others enjoy the privilege to do so, too.",
            "It is better to be looked over than overlooked.",
            "The books that the world calls immoral are the books that show the world it's own shame."
    };
    // Member methods (behaviors)
    public String getAphorism() {

        String aphorism = "";   // Initialize to empty string
        // Randomly select a fact
        int randomNumber;
        Random randomGenerator = new Random();  // Construct new random number generator
        do {
            randomNumber = randomGenerator.nextInt(mAphorisms.length);
        }while(randomNumber == aphorismNumber);

        if(randomNumber >= 0 && randomNumber < mAphorisms.length){
            aphorism = mAphorisms[randomNumber];
        }
        else {
            aphorism = "An error has occurred!";
        }
        setAphorismNumber(randomNumber);
        return aphorism;
    }

    public int getAphorismTotal(){
        return mAphorisms.length;
    }
    public int getAphorismNumber(){
        return aphorismNumber + 1;
    }

    public void setAphorismNumber(int number){
        aphorismNumber = number;
    }
}

package defpackage;

import com.anistation.android.R;
import com.anistation.model.CoverImage;
import com.anistation.model.Info;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaSeason;
import com.anistation.model.MediaSource;
import com.anistation.model.MediaStatus;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.Title;
import com.anistation.model.animelist.AnimeListImportProvider;
import com.anistation.model.animelist.WatchStatus;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qs0 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ qs0(byte b) {
        this.x = b;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        byte b = this.x;
        q18 q18Var = au0.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vo3 c = b90.c(pk2.C, false);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, vz3Var);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, c);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    yt2.a(w65.H(R.drawable.restore, kd2Var, 0), null, ar5.i(vz3Var, 20.0f), ((mp0) kd2Var.j(op0.a)).o, kd2Var, 440, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!kd2Var2.V(intValue2 & 1, z2)) {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!kd2Var3.V(intValue3 & 1, z3)) {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z4)) {
                    yt2.a(w65.H(R.drawable.delete, kd2Var4, 0), lz5.f(R.string.delete, kd2Var4), null, ep0.e, kd2Var4, 3080, 4);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z5)) {
                    yt2.a(w65.H(R.drawable.close, kd2Var5, 0), lz5.f(R.string.close, kd2Var5), ar5.i(vz3Var, 20.0f), 0L, kd2Var5, 392, 8);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z6)) {
                    yt2.a(w65.H(R.drawable.arrow_down, kd2Var6, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var6, 440, 8);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (kd2Var7.V(intValue7 & 1, z7)) {
                    yt2.a(w65.H(R.drawable.play_filled, kd2Var7, 0), null, null, 0L, kd2Var7, 56, 12);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 7:
                kd2 kd2Var8 = (kd2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (kd2Var8.V(intValue8 & 1, z8)) {
                    Title title = new Title("ONE PIECE", "ONE PIECE", "ONE PIECE", "ONE PIECE");
                    MediaStatus mediaStatus = MediaStatus.RELEASING;
                    CoverImage coverImage = new CoverImage("", "");
                    MediaSource mediaSource = MediaSource.MANGA;
                    MediaFormat mediaFormat = MediaFormat.TV;
                    NextAiringEpisode nextAiringEpisode = new NextAiringEpisode(1164, 1780236960L, 23126L);
                    List I = te4.I("Action", "Adventure", "Comedy", "Drama", "Fantasy");
                    MediaSeason mediaSeason = MediaSeason.FALL;
                    nt1 nt1Var = nt1.x;
                    Info info = new Info("one-piece-abc", 21, 21, title, coverImage, "", "#e49335", "Gold Roger was known as the Pirate King, the strongest and most infamous being to have sailed the Grand Line. The capture and death of Roger by the World Government brought a change throughout the world. His last words before his death revealed the location of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece (which promises an unlimited amount of riches and fame), and quite possibly the most coveted of titles for the person who found it, the title of the Pirate King.<br><br>\\nEnter Monkey D. Luffy, a 17-year-old boy that defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate who ransacks villages for fun, Luffy’s reason for being a pirate is one of pure wonder; the thought of an exciting adventure and meeting new and intriguing people, along with finding One Piece, are his reasons of becoming a pirate. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach One Piece.<br><br>\\n<b>*This includes following special episodes:</b><br>\\n- Chopperman to the Rescue! Protect the TV Station by the Shore! (Episode 336)<br>\\n- The Strongest Tag-Team! Luffy and Toriko's Hard Struggle! (Episode 492)<br>\\n- Team Formation! Save Chopper (Episode 542)<br>\\n- History's Strongest Collaboration vs. Glutton of the Sea (Episode 590)<br>\\n- 20th Anniversary! Special Romance Dawn (Episode 907)", "Oct 20, 1999", null, mediaFormat, mediaStatus, null, 24, 87, 707569, 173, mediaSeason, 1999, I, nt1Var, "JP", mediaSource, false, nextAiringEpisode, nt1Var, nt1Var, nt1Var, nt1Var);
                    WatchStatus watchStatus = WatchStatus.PLAN_TO_WATCH;
                    Object Q = kd2Var8.Q();
                    if (Q == q18Var) {
                        Q = new gr((byte) 14);
                        kd2Var8.n0(Q);
                    }
                    sb2 sb2Var = (sb2) Q;
                    Object Q2 = kd2Var8.Q();
                    if (Q2 == q18Var) {
                        Q2 = new hi0((byte) 9);
                        kd2Var8.n0(Q2);
                    }
                    nx7.c(info, true, 100, 1, watchStatus, true, false, sb2Var, (ub2) Q2, null, kd2Var8, 115043760, 512);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            case 8:
                kd2 kd2Var9 = (kd2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (kd2Var9.V(intValue9 & 1, z9)) {
                    io3.a(null, 0, 0.0f, kd2Var9, 0, 7);
                } else {
                    kd2Var9.Y();
                }
                return pn6Var;
            case 9:
                kd2 kd2Var10 = (kd2) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!kd2Var10.V(intValue10 & 1, z10)) {
                    kd2Var10.Y();
                }
                return pn6Var;
            case 10:
                kd2 kd2Var11 = (kd2) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (kd2Var11.V(intValue11 & 1, z11)) {
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 20.0f);
                    xp0 a = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.K, kd2Var11, 6);
                    int hashCode2 = Long.hashCode(kd2Var11.T);
                    al4 l2 = kd2Var11.l();
                    yz3 E2 = o80.E(kd2Var11, R);
                    tt0.d.getClass();
                    kd2Var11.h0();
                    if (kd2Var11.S) {
                        kd2Var11.k(t53Var);
                    } else {
                        kd2Var11.q0();
                    }
                    ss5.i(p7.F, kd2Var11, a);
                    ss5.i(p7.E, kd2Var11, l2);
                    ss5.i(p7.G, kd2Var11, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var11);
                    ss5.i(p7.D, kd2Var11, E2);
                    yc6.b(lz5.f(R.string.donation_notice_body, kd2Var11), null, ep0.b(0.75f, ((mp0) kd2Var11.j(op0.a)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, ((nl6) kd2Var11.j(pl6.a)).l, kd2Var11, 0, 0, 130042);
                    kd2Var11.q(true);
                } else {
                    kd2Var11.Y();
                }
                return pn6Var;
            case 11:
                kd2 kd2Var12 = (kd2) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (kd2Var12.V(intValue12 & 1, z12)) {
                    yt2.a(w65.H(R.drawable.play, kd2Var12, 0), null, null, ((mp0) kd2Var12.j(op0.a)).n, kd2Var12, 56, 4);
                } else {
                    kd2Var12.Y();
                }
                return pn6Var;
            case 12:
                kd2 kd2Var13 = (kd2) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (kd2Var13.V(intValue13 & 1, z13)) {
                    yt2.a(w65.H(R.drawable.delete, kd2Var13, 0), lz5.f(R.string.delete_download, kd2Var13), null, 0L, kd2Var13, 8, 12);
                } else {
                    kd2Var13.Y();
                }
                return pn6Var;
            case 13:
                kd2 kd2Var14 = (kd2) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (kd2Var14.V(intValue14 & 1, z14)) {
                    yt2.a(w65.H(R.drawable.delete, kd2Var14, 0), lz5.f(R.string.delete, kd2Var14), null, ep0.e, kd2Var14, 3080, 4);
                } else {
                    kd2Var14.Y();
                }
                return pn6Var;
            case 14:
                kd2 kd2Var15 = (kd2) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (kd2Var15.V(intValue15 & 1, z15)) {
                    yt2.a(w65.H(R.drawable.sd_card, kd2Var15, 0), null, ar5.i(vz3Var, 15.0f), 0L, kd2Var15, 440, 8);
                } else {
                    kd2Var15.Y();
                }
                return pn6Var;
            case 15:
                kd2 kd2Var16 = (kd2) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (kd2Var16.V(intValue16 & 1, z16)) {
                    yt2.a(w65.H(R.drawable.close, kd2Var16, 0), lz5.f(R.string.cancel_download, kd2Var16), null, 0L, kd2Var16, 8, 12);
                } else {
                    kd2Var16.Y();
                }
                return pn6Var;
            case 16:
                kd2 kd2Var17 = (kd2) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (kd2Var17.V(intValue17 & 1, z17)) {
                    yt2.a(w65.H(R.drawable.trending, kd2Var17, 0), lz5.f(R.string.trending, kd2Var17), ar5.i(vz3Var, 30.0f), ep0.i, kd2Var17, 3464, 0);
                } else {
                    kd2Var17.Y();
                }
                return pn6Var;
            case 17:
                kd2 kd2Var18 = (kd2) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (kd2Var18.V(intValue18 & 1, z18)) {
                    yt2.a(w65.H(R.drawable.popular, kd2Var18, 0), lz5.f(R.string.popular, kd2Var18), ar5.i(vz3Var, 30.0f), ep0.i, kd2Var18, 3464, 0);
                } else {
                    kd2Var18.Y();
                }
                return pn6Var;
            case 18:
                kd2 kd2Var19 = (kd2) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (kd2Var19.V(intValue19 & 1, z19)) {
                    yt2.a(w65.H(R.drawable.award, kd2Var19, 0), lz5.f(R.string.topAnime, kd2Var19), ar5.i(vz3Var, 30.0f), ep0.i, kd2Var19, 3464, 0);
                } else {
                    kd2Var19.Y();
                }
                return pn6Var;
            case 19:
                kd2 kd2Var20 = (kd2) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (kd2Var20.V(intValue20 & 1, z20)) {
                    yz3 S = n77.S(vz3Var, 14.0f, 8.0f);
                    vo3 c2 = b90.c(pk2.C, false);
                    int hashCode3 = Long.hashCode(kd2Var20.T);
                    al4 l3 = kd2Var20.l();
                    yz3 E3 = o80.E(kd2Var20, S);
                    tt0.d.getClass();
                    kd2Var20.h0();
                    if (kd2Var20.S) {
                        kd2Var20.k(t53Var);
                    } else {
                        kd2Var20.q0();
                    }
                    ss5.i(p7.F, kd2Var20, c2);
                    ss5.i(p7.E, kd2Var20, l3);
                    ss5.i(p7.G, kd2Var20, Integer.valueOf(hashCode3));
                    ss5.h(kd2Var20);
                    ss5.i(p7.D, kd2Var20, E3);
                    yc6.b("\t\t\t\t\t\t", null, ((mp0) kd2Var20.j(op0.a)).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var20.j(pl6.a)).k, kd2Var20, 1572870, 0, 131002);
                    kd2Var20.q(true);
                } else {
                    kd2Var20.Y();
                }
                return pn6Var;
            case 20:
                kd2 kd2Var21 = (kd2) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (kd2Var21.V(intValue21 & 1, z21)) {
                    yt2.a(w65.H(R.drawable.user, kd2Var21, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var21, 440, 8);
                } else {
                    kd2Var21.Y();
                }
                return pn6Var;
            case 21:
                kd2 kd2Var22 = (kd2) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (kd2Var22.V(intValue22 & 1, z22)) {
                    yt2.a(w65.H(R.drawable.close, kd2Var22, 0), lz5.f(R.string.clear_text_input_field, kd2Var22), ar5.i(vz3Var, 18.0f), ep0.b(0.6f, ((mp0) kd2Var22.j(op0.a)).o), kd2Var22, 392, 0);
                } else {
                    kd2Var22.Y();
                }
                return pn6Var;
            case 22:
                boolean z30 = false;
                kd2 kd2Var23 = (kd2) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z30 = true;
                }
                if (kd2Var23.V(intValue23 & 1, z30)) {
                    xm6 xm6Var = new xm6(false, AnimeListImportProvider.MAL, null, null, 268369919);
                    Object Q3 = kd2Var23.Q();
                    if (Q3 == q18Var) {
                        Q3 = new hi0((byte) 10);
                        kd2Var23.n0(Q3);
                    }
                    ub2 ub2Var = (ub2) Q3;
                    Object Q4 = kd2Var23.Q();
                    if (Q4 == q18Var) {
                        Q4 = new hi0((byte) 11);
                        kd2Var23.n0(Q4);
                    }
                    ub2 ub2Var2 = (ub2) Q4;
                    Object Q5 = kd2Var23.Q();
                    if (Q5 == q18Var) {
                        Q5 = new gr((byte) 15);
                        kd2Var23.n0(Q5);
                    }
                    sb2 sb2Var2 = (sb2) Q5;
                    Object Q6 = kd2Var23.Q();
                    if (Q6 == q18Var) {
                        Q6 = new hi0((byte) 12);
                        kd2Var23.n0(Q6);
                    }
                    ub2 ub2Var3 = (ub2) Q6;
                    Object Q7 = kd2Var23.Q();
                    if (Q7 == q18Var) {
                        Q7 = new gr((byte) 16);
                        kd2Var23.n0(Q7);
                    }
                    oi4.c(xm6Var, "", ub2Var, ub2Var2, sb2Var2, ub2Var3, (sb2) Q7, null, kd2Var23, 1797560);
                } else {
                    kd2Var23.Y();
                }
                return pn6Var;
            case 23:
                kd2 kd2Var24 = (kd2) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (kd2Var24.V(intValue24 & 1, z23)) {
                    yt2.a(w65.H(R.drawable.arrow_down, kd2Var24, 0), lz5.f(R.string.minimize, kd2Var24), null, 0L, kd2Var24, 8, 12);
                } else {
                    kd2Var24.Y();
                }
                return pn6Var;
            case 24:
                kd2 kd2Var25 = (kd2) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (kd2Var25.V(intValue25 & 1, z24)) {
                    yt2.a(w65.H(R.drawable.lock, kd2Var25, 0), lz5.f(R.string.lock_screen, kd2Var25), null, 0L, kd2Var25, 8, 12);
                } else {
                    kd2Var25.Y();
                }
                return pn6Var;
            case 25:
                kd2 kd2Var26 = (kd2) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (kd2Var26.V(intValue26 & 1, z25)) {
                    yt2.a(w65.H(R.drawable.settings, kd2Var26, 0), lz5.f(R.string.player_settings, kd2Var26), null, 0L, kd2Var26, 8, 12);
                } else {
                    kd2Var26.Y();
                }
                return pn6Var;
            case 26:
                kd2 kd2Var27 = (kd2) obj;
                int intValue27 = ((Integer) obj2).intValue();
                if ((intValue27 & 3) != 2) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (kd2Var27.V(intValue27 & 1, z26)) {
                    yt2.a(w65.H(R.drawable.resize, kd2Var27, 0), lz5.f(R.string.content_scale, kd2Var27), null, ep0.e, kd2Var27, 3080, 4);
                } else {
                    kd2Var27.Y();
                }
                return pn6Var;
            case 27:
                kd2 kd2Var28 = (kd2) obj;
                int intValue28 = ((Integer) obj2).intValue();
                if ((intValue28 & 3) != 2) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (kd2Var28.V(intValue28 & 1, z27)) {
                    z75 a2 = y75.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.I, kd2Var28, 54);
                    int hashCode4 = Long.hashCode(kd2Var28.T);
                    al4 l4 = kd2Var28.l();
                    yz3 E4 = o80.E(kd2Var28, vz3Var);
                    tt0.d.getClass();
                    kd2Var28.h0();
                    if (kd2Var28.S) {
                        kd2Var28.k(t53Var);
                    } else {
                        kd2Var28.q0();
                    }
                    ss5.i(p7.F, kd2Var28, a2);
                    ss5.i(p7.E, kd2Var28, l4);
                    ss5.i(p7.G, kd2Var28, Integer.valueOf(hashCode4));
                    ss5.h(kd2Var28);
                    ss5.i(p7.D, kd2Var28, E4);
                    String f = lz5.f(R.string.skip, kd2Var28);
                    long j = ep0.e;
                    yc6.b(f, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var28.j(pl6.a)).l, kd2Var28, 384, 0, 131066);
                    yt2.a(w65.H(R.drawable.next, kd2Var28, 0), null, ar5.i(vz3Var, 15.0f), j, kd2Var28, 3512, 0);
                    kd2Var28.q(true);
                } else {
                    kd2Var28.Y();
                }
                return pn6Var;
            case 28:
                kd2 kd2Var29 = (kd2) obj;
                int intValue29 = ((Integer) obj2).intValue();
                if ((intValue29 & 3) != 2) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                if (kd2Var29.V(intValue29 & 1, z28)) {
                    yt2.a(w65.H(R.drawable.arrow_left, kd2Var29, 0), lz5.f(R.string.go_back, kd2Var29), null, ((mp0) kd2Var29.j(op0.a)).q, kd2Var29, 8, 4);
                } else {
                    kd2Var29.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var30 = (kd2) obj;
                int intValue30 = ((Integer) obj2).intValue();
                if ((intValue30 & 3) != 2) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (kd2Var30.V(intValue30 & 1, z29)) {
                    yt2.a(w65.H(R.drawable.close, kd2Var30, 0), lz5.f(R.string.clear_text_input_field, kd2Var30), ar5.i(vz3Var, 18.0f), ep0.b(0.6f, ((mp0) kd2Var30.j(op0.a)).o), kd2Var30, 392, 0);
                } else {
                    kd2Var30.Y();
                }
                return pn6Var;
        }
    }
}

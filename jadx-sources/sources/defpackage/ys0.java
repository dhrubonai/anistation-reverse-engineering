package defpackage;

import com.anistation.android.R;
import com.anistation.model.MediaFormat;
import com.anistation.model.download.DownloadStorageType;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineSubtitleMetadata;
import com.anistation.model.watch.Provider;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.Skips;
import com.anistation.model.watch.Track;
import com.discord.org.webrtc.PeerConnection;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ys0 implements ic2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ ys0(byte b) {
        this.x = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [z44] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [z44] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
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
        byte b = this.x;
        byte b2 = 18;
        byte b3 = 17;
        vz3 vz3Var = vz3.x;
        q18 q18Var = au0.a;
        boolean z17 = false;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z17 = true;
                }
                if (!kd2Var.V(intValue & 1, z17)) {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z17 = true;
                }
                if (!kd2Var2.V(intValue2 & 1, z17)) {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z17 = true;
                }
                if (!kd2Var3.V(intValue3 & 1, z17)) {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var4.V(intValue4 & 1, z)) {
                    yt2.a(w65.H(R.drawable.server, kd2Var4, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var4, 440, 8);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z2)) {
                    yt2.a(w65.H(R.drawable.share, kd2Var5, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var5, 440, 8);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z3)) {
                    yt2.a(w65.H(R.drawable.remove_my_list, kd2Var6, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var6, 440, 8);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                kd2 kd2Var7 = (kd2) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var7.V(intValue7 & 1, z4)) {
                    yt2.a(w65.H(R.drawable.tick, kd2Var7, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var7, 440, 8);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 7:
                kd2 kd2Var8 = (kd2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var8.V(intValue8 & 1, z5)) {
                    b90.a(bx7.h(n03.k(ar5.e(ar5.l(n77.T(vz3Var, 0.0f, 10.0f, 1), 40.0f), 5.0f), tm5.b), ((mp0) kd2Var8.j(op0.a)).r, io3.h), kd2Var8, 0);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            case 8:
                kd2 kd2Var9 = (kd2) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var9.V(intValue9 & 1, z6)) {
                    b90.a(bx7.h(n03.k(ar5.e(ar5.l(n77.T(vz3Var, 0.0f, 10.0f, 1), 40.0f), 5.0f), tm5.b), ((mp0) kd2Var9.j(op0.a)).r, io3.h), kd2Var9, 0);
                } else {
                    kd2Var9.Y();
                }
                return pn6Var;
            case 9:
                kd2 kd2Var10 = (kd2) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (kd2Var10.V(intValue10 & 1, z7)) {
                    yt2.a(w65.H(R.drawable.quality, kd2Var10, 0), null, null, ((mp0) kd2Var10.j(op0.a)).o, kd2Var10, 56, 4);
                } else {
                    kd2Var10.Y();
                }
                return pn6Var;
            case 10:
                kd2 kd2Var11 = (kd2) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (kd2Var11.V(intValue11 & 1, z8)) {
                    yt2.a(w65.H(R.drawable.download, kd2Var11, 0), null, null, ((mp0) kd2Var11.j(op0.a)).o, kd2Var11, 56, 4);
                } else {
                    kd2Var11.Y();
                }
                return pn6Var;
            case 11:
                kd2 kd2Var12 = (kd2) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (kd2Var12.V(intValue12 & 1, z9)) {
                    yt2.a(w65.H(R.drawable.playback, kd2Var12, 0), null, null, ((mp0) kd2Var12.j(op0.a)).o, kd2Var12, 56, 4);
                } else {
                    kd2Var12.Y();
                }
                return pn6Var;
            case 12:
                kd2 kd2Var13 = (kd2) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kd2Var13.V(intValue13 & 1, z10)) {
                    yt2.a(w65.H(R.drawable.skip, kd2Var13, 0), null, null, ((mp0) kd2Var13.j(op0.a)).o, kd2Var13, 56, 4);
                } else {
                    kd2Var13.Y();
                }
                return pn6Var;
            case 13:
                kd2 kd2Var14 = (kd2) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (kd2Var14.V(intValue14 & 1, z11)) {
                    yt2.a(w65.H(R.drawable.next_outlined, kd2Var14, 0), null, null, ((mp0) kd2Var14.j(op0.a)).o, kd2Var14, 56, 4);
                } else {
                    kd2Var14.Y();
                }
                return pn6Var;
            case 14:
                kd2 kd2Var15 = (kd2) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (kd2Var15.V(intValue15 & 1, z12)) {
                    yt2.a(w65.H(R.drawable.minus, kd2Var15, 0), null, null, ((mp0) kd2Var15.j(op0.a)).o, kd2Var15, 56, 4);
                } else {
                    kd2Var15.Y();
                }
                return pn6Var;
            case 15:
                kd2 kd2Var16 = (kd2) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (kd2Var16.V(intValue16 & 1, z13)) {
                    yt2.a(w65.H(R.drawable.plus, kd2Var16, 0), null, null, ((mp0) kd2Var16.j(op0.a)).o, kd2Var16, 56, 4);
                } else {
                    kd2Var16.Y();
                }
                return pn6Var;
            case 16:
                kd2 kd2Var17 = (kd2) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var17.V(intValue17 & 1, z17)) {
                    int i = 56;
                    q71 q71Var = null;
                    boolean z18 = false;
                    boolean z19 = false;
                    Integer num = null;
                    boolean z20 = false;
                    Server server = new Server(te4.I(new Provider("mimi", false, "Hard sub, Fastest, High quality", false, false, (Integer) null, 56, (q71) null), new Provider("kiwi", true, "Soft sub, Good, Multi quality", z18, z19, num, i, q71Var), new Provider("mochi", z20, "Hard sub, Fastest, High quality", z18, z19, num, i, q71Var), new Provider("yuki", z20, "Soft sub, Good, Multi quality", z18, z19, num, i, q71Var)), nt1.x);
                    Object Q = kd2Var17.Q();
                    if (Q == q18Var) {
                        Q = new hi0((byte) 22);
                        kd2Var17.n0(Q);
                    }
                    lt5.d(server, Float.NaN, "mimi", false, false, (ub2) Q, kd2Var17, 224688);
                } else {
                    kd2Var17.Y();
                }
                return pn6Var;
            case 17:
                ((Boolean) obj2).booleanValue();
                ((String) obj).getClass();
                return pn6Var;
            case 18:
                ((Boolean) obj2).booleanValue();
                ((String) obj).getClass();
                return pn6Var;
            case 19:
                kd2 kd2Var18 = (kd2) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var18.V(intValue18 & 1, z17)) {
                    List I = te4.I("1080p", "720p", "480p", "360p", "Auto");
                    Object Q2 = kd2Var18.Q();
                    if (Q2 == q18Var) {
                        Q2 = new hi0((byte) 21);
                        kd2Var18.n0(Q2);
                    }
                    lt5.c("1080p", I, Float.NaN, false, (ub2) Q2, kd2Var18, 28086);
                } else {
                    kd2Var18.Y();
                }
                return pn6Var;
            case 20:
                kd2 kd2Var19 = (kd2) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var19.V(intValue19 & 1, z17)) {
                    Object Q3 = kd2Var19.Q();
                    if (Q3 == q18Var) {
                        Q3 = new hi0((byte) 20);
                        kd2Var19.n0(Q3);
                    }
                    lt5.h(1.0f, (ub2) Q3, kd2Var19, 54);
                } else {
                    kd2Var19.Y();
                }
                return pn6Var;
            case 21:
                kd2 kd2Var20 = (kd2) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var20.V(intValue20 & 1, z17)) {
                    Track track = new Track("en", "", "en", "English", true);
                    List I2 = te4.I(new Track("en", "", "en", "English", true), new Track("id", "", "id", "Indonesian", false), new Track("th", "", "th", "Thai", false));
                    Object Q4 = kd2Var20.Q();
                    if (Q4 == q18Var) {
                        Q4 = new hi0((byte) 13);
                        kd2Var20.n0(Q4);
                    }
                    lt5.e(true, track, I2, Float.NaN, (ub2) Q4, kd2Var20, 27654);
                } else {
                    kd2Var20.Y();
                }
                return pn6Var;
            case 22:
                kd2 kd2Var21 = (kd2) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var21.V(intValue21 & 1, z17)) {
                    List I3 = te4.I("1080p", "720p", "480p", "360p");
                    Object Q5 = kd2Var21.Q();
                    if (Q5 == q18Var) {
                        Q5 = new hi0((byte) 17);
                        kd2Var21.n0(Q5);
                    }
                    ub2 ub2Var = (ub2) Q5;
                    Object Q6 = kd2Var21.Q();
                    if (Q6 == q18Var) {
                        Q6 = new hi0((byte) 18);
                        kd2Var21.n0(Q6);
                    }
                    ub2 ub2Var2 = (ub2) Q6;
                    Object Q7 = kd2Var21.Q();
                    if (Q7 == q18Var) {
                        Q7 = new gr((byte) 20);
                        kd2Var21.n0(Q7);
                    }
                    sb2 sb2Var = (sb2) Q7;
                    Object Q8 = kd2Var21.Q();
                    if (Q8 == q18Var) {
                        Q8 = new hi0((byte) 19);
                        kd2Var21.n0(Q8);
                    }
                    ub2 ub2Var3 = (ub2) Q8;
                    Object Q9 = kd2Var21.Q();
                    if (Q9 == q18Var) {
                        Q9 = new gr((byte) 21);
                        kd2Var21.n0(Q9);
                    }
                    sb2 sb2Var2 = (sb2) Q9;
                    Object Q10 = kd2Var21.Q();
                    if (Q10 == q18Var) {
                        Q10 = new ys0(b2);
                        kd2Var21.n0(Q10);
                    }
                    ic2 ic2Var = (ic2) Q10;
                    Object Q11 = kd2Var21.Q();
                    if (Q11 == q18Var) {
                        Q11 = new gr((byte) 22);
                        kd2Var21.n0(Q11);
                    }
                    lt5.b(null, null, "kiwi", I3, true, true, 1, Float.NaN, kk1.x, ub2Var, false, false, false, false, ub2Var2, sb2Var, ub2Var3, sb2Var2, ic2Var, (sb2) Q11, kd2Var21, 920350134, 920350134);
                } else {
                    kd2Var21.Y();
                }
                return pn6Var;
            case 23:
                kd2 kd2Var22 = (kd2) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (kd2Var22.V(intValue22 & 1, z14)) {
                    yt2.a(w65.H(R.drawable.mic, kd2Var22, 0), null, null, ((mp0) kd2Var22.j(op0.a)).o, kd2Var22, 56, 4);
                } else {
                    kd2Var22.Y();
                }
                return pn6Var;
            case 24:
                kd2 kd2Var23 = (kd2) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z17 = true;
                }
                if (kd2Var23.V(intValue23 & 1, z17)) {
                    EpisodeDownload episodeDownload = new EpisodeDownload(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, new OfflineDownloadMetadata(0, "one-piece-abcd", 1, (Integer) 1, "One Piece", "I'm Luffy!", 1, "", "", (String) null, Boolean.FALSE, (String) null, (Integer) null, (Integer) null, (MediaFormat) null, "kiwi", "sub", DownloadStorageType.INTERNAL, "1080p", "", "", (Map) ot1.x, (OfflineSubtitleMetadata) null, (Skips) null, (String) null, System.currentTimeMillis(), (String) null, (String) null, 201327105, (q71) null), EpisodeDownloadState.DOWNLOADING, false, false, 45.0f, 104857600L, 262144000L, 0, false, null, null, null, 7704, null);
                    List I4 = te4.I("1080p", "720p", "480p", "360p");
                    Object Q12 = kd2Var23.Q();
                    if (Q12 == q18Var) {
                        Q12 = new hi0((byte) 14);
                        kd2Var23.n0(Q12);
                    }
                    ub2 ub2Var4 = (ub2) Q12;
                    Object Q13 = kd2Var23.Q();
                    if (Q13 == q18Var) {
                        Q13 = new hi0((byte) 15);
                        kd2Var23.n0(Q13);
                    }
                    ub2 ub2Var5 = (ub2) Q13;
                    Object Q14 = kd2Var23.Q();
                    if (Q14 == q18Var) {
                        Q14 = new gr((byte) 17);
                        kd2Var23.n0(Q14);
                    }
                    sb2 sb2Var3 = (sb2) Q14;
                    Object Q15 = kd2Var23.Q();
                    if (Q15 == q18Var) {
                        Q15 = new hi0((byte) 16);
                        kd2Var23.n0(Q15);
                    }
                    ub2 ub2Var6 = (ub2) Q15;
                    Object Q16 = kd2Var23.Q();
                    if (Q16 == q18Var) {
                        Q16 = new gr((byte) 18);
                        kd2Var23.n0(Q16);
                    }
                    sb2 sb2Var4 = (sb2) Q16;
                    Object Q17 = kd2Var23.Q();
                    if (Q17 == q18Var) {
                        Q17 = new ys0(b3);
                        kd2Var23.n0(Q17);
                    }
                    ic2 ic2Var2 = (ic2) Q17;
                    Object Q18 = kd2Var23.Q();
                    if (Q18 == q18Var) {
                        Q18 = new gr((byte) 19);
                        kd2Var23.n0(Q18);
                    }
                    lt5.b(episodeDownload, null, "kiwi", I4, true, true, 1, Float.NaN, kk1.x, ub2Var4, false, false, false, false, ub2Var5, sb2Var3, ub2Var6, sb2Var4, ic2Var2, (sb2) Q18, kd2Var23, 920350128, 920350134);
                } else {
                    kd2Var23.Y();
                }
                return pn6Var;
            case 25:
                kd2 kd2Var24 = (kd2) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (kd2Var24.V(intValue24 & 1, z15)) {
                    yt2.a(w65.H(R.drawable.closed_caption, kd2Var24, 0), null, null, ((mp0) kd2Var24.j(op0.a)).o, kd2Var24, 56, 4);
                } else {
                    kd2Var24.Y();
                }
                return pn6Var;
            case 26:
                kd2 kd2Var25 = (kd2) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (kd2Var25.V(intValue25 & 1, z16)) {
                    yt2.a(w65.H(R.drawable.server, kd2Var25, 0), null, null, ((mp0) kd2Var25.j(op0.a)).o, kd2Var25, 56, 4);
                } else {
                    kd2Var25.Y();
                }
                return pn6Var;
            case 27:
                kd2 kd2Var26 = (kd2) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z17 = true;
                }
                if (!kd2Var26.V(intValue26 & 1, z17)) {
                    kd2Var26.Y();
                }
                return pn6Var;
            case 28:
                ((za3) ((tt0) obj)).e0((yz3) obj2);
                return pn6Var;
            default:
                yu0 yu0Var = (yu0) obj2;
                za3 za3Var = (za3) ((tt0) obj);
                za3Var.Y = yu0Var;
                kf kfVar = za3Var.c0;
                tq1 tq1Var = bv0.h;
                al4 al4Var = (al4) yu0Var;
                al4Var.getClass();
                za3Var.a0((ud1) sw0.E(al4Var, tq1Var));
                al4 al4Var2 = (al4) yu0Var;
                ia3 ia3Var = (ia3) sw0.E(al4Var2, bv0.n);
                if (za3Var.W != ia3Var) {
                    za3Var.W = ia3Var;
                    za3Var.F();
                    za3 v = za3Var.v();
                    if (v != null) {
                        v.D();
                    } else {
                        kh4 kh4Var = za3Var.K;
                        if (kh4Var != null) {
                            ((oa) kh4Var).invalidate();
                        }
                    }
                    za3Var.E();
                    for (xz3 xz3Var = (xz3) kfVar.D; xz3Var != null; xz3Var = xz3Var.C) {
                        xz3Var.V();
                    }
                }
                za3Var.f0((rv6) sw0.E(al4Var2, bv0.t));
                xz3 xz3Var2 = (xz3) kfVar.D;
                if ((xz3Var2.A & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                    while (xz3Var2 != null) {
                        if ((xz3Var2.z & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                            zc1 zc1Var = xz3Var2;
                            ?? r6 = 0;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof wu0) {
                                    xz3 xz3Var3 = ((xz3) ((wu0) zc1Var)).x;
                                    if (xz3Var3.K) {
                                        ga4.c(xz3Var3);
                                    } else {
                                        xz3Var3.G = true;
                                    }
                                } else if ((zc1Var.z & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var4 = zc1Var.M;
                                    int i2 = 0;
                                    zc1Var = zc1Var;
                                    r6 = r6;
                                    while (xz3Var4 != null) {
                                        if ((xz3Var4.z & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                zc1Var = xz3Var4;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r6.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r6.b(xz3Var4);
                                            }
                                        }
                                        xz3Var4 = xz3Var4.C;
                                        zc1Var = zc1Var;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r6);
                            }
                        }
                        if ((xz3Var2.A & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                            xz3Var2 = xz3Var2.C;
                        }
                    }
                }
                return pn6Var;
        }
    }
}

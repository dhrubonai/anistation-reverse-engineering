package defpackage;

import android.view.KeyEvent;
import com.anistation.model.Episode;
import com.anistation.model.Resource;
import com.anistation.model.settings.HoldAction;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.watch.WatchSession;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nl5 extends uc2 implements ub2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl5(v27 v27Var, byte b) {
        super(1, v27Var, v27.class, "startSession", "startSession(Lcom/anistation/model/watch/WatchSession;)V", 0);
        this.x = b;
        switch (b) {
            case 15:
                super(1, v27Var, v27.class, "selectAudioTrack", "selectAudioTrack(Lcom/anistation/watch/util/AudioTrackOption;)V", 0);
                return;
            case 16:
                super(1, v27Var, v27.class, "setPlaybackSpeed", "setPlaybackSpeed(F)V", 0);
                return;
            case 17:
                super(1, v27Var, v27.class, "setAutoSkip", "setAutoSkip(Z)V", 0);
                return;
            case 18:
                super(1, v27Var, v27.class, "setAutoNext", "setAutoNext(Z)V", 0);
                return;
            case 19:
                super(1, v27Var, v27.class, "setServer", "setServer(Ljava/lang/String;)V", 0);
                return;
            case 20:
                super(1, v27Var, v27.class, "selectTrackQuality", "selectTrackQuality(Ljava/lang/String;)V", 0);
                return;
            case 21:
                super(1, v27Var, v27.class, "selectSubtitleTrack", "selectSubtitleTrack(Lcom/anistation/model/watch/Track;)V", 0);
                return;
            case 22:
                super(1, v27Var, v27.class, "upsertSelectedContentScale", "upsertSelectedContentScale(Ljava/lang/String;)V", 0);
                return;
            case 23:
                super(1, v27Var, v27.class, "setIsFullscreen", "setIsFullscreen(Z)V", 0);
                return;
            case 24:
                super(1, v27Var, v27.class, "setAutoPlay", "setAutoPlay(Z)V", 0);
                return;
            case 25:
                super(1, v27Var, v27.class, "setSubtitleEnabled", "setSubtitleEnabled(Z)V", 0);
                return;
            case 26:
                super(1, v27Var, v27.class, "setIsControlsVisible", "setIsControlsVisible(Z)V", 0);
                return;
            case 27:
                super(1, v27Var, v27.class, "setCurrentPosition", "setCurrentPosition(J)V", 0);
                return;
            case 28:
                super(1, v27Var, v27.class, "seekTo", "seekTo(J)V", 0);
                return;
            case 29:
                super(1, v27Var, v27.class, "setIsSeeking", "setIsSeeking(Z)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj) {
        Object value;
        String str = (String) obj;
        str.getClass();
        v27 v27Var = (v27) this.receiver;
        sx5 sx5Var = v27Var.n;
        vy1 vy1Var = v27Var.k;
        Object obj2 = null;
        tl7.z(zz.J(v27Var), null, null, new t27(v27Var, str, 0 == true ? 1 : 0, (byte) 2), 3);
        if (!((dq4) v27Var.o.getValue()).j) {
            if (str.equalsIgnoreCase("Auto")) {
                hb1 hb1Var = (hb1) vy1Var.P0();
                hb1Var.getClass();
                gb1 gb1Var = new gb1(hb1Var);
                gb1Var.d(2);
                vy1Var.L(gb1Var.b());
            } else {
                Integer J = b06.J(10, b06.G(str, "p", ""));
                if (J != null) {
                    int intValue = J.intValue();
                    nw2 nw2Var = vy1Var.j0().a;
                    nw2Var.getClass();
                    int size = nw2Var.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj3 = nw2Var.get(i2);
                        i2++;
                        if (((ph6) obj3).b.c == 2) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    ph6 ph6Var = (ph6) obj2;
                    if (ph6Var != null) {
                        int i3 = ph6Var.a;
                        while (true) {
                            if (i < i3) {
                                if (ph6Var.a(i).x == intValue) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if (i != -1) {
                            hb1 hb1Var2 = (hb1) vy1Var.P0();
                            hb1Var2.getClass();
                            gb1 gb1Var2 = new gb1(hb1Var2);
                            gb1Var2.g(new dh6(ph6Var.b, i));
                            vy1Var.L(gb1Var2.b());
                        }
                    }
                }
                return pn6.a;
            }
            while (true) {
                Object value2 = sx5Var.getValue();
                sx5 sx5Var2 = sx5Var;
                if (sx5Var2.j(value2, ym6.a((ym6) value2, null, null, null, null, null, str, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -33, 15))) {
                    break;
                }
                sx5Var = sx5Var2;
            }
            return pn6.a;
        }
        do {
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, ym6.a((ym6) value, null, null, null, null, null, "Auto", null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -33, 15)));
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r5 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl5.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r2.y(r3) != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl5.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [r05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [bg] */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Integer a;
        f83 t;
        Object value;
        Resource resource;
        List list;
        Resource resource2;
        boolean z;
        Episode episode;
        MediaTrack mediaTrack;
        boolean z2;
        int i;
        List list2;
        MediaTrack mediaTrack2;
        String str;
        Object value2;
        ym6 ym6Var;
        String str2;
        String str3;
        ym6 ym6Var2;
        Episode episode2;
        Object value3;
        byte b = this.x;
        byte b2 = 2;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        byte b3 = 1;
        vz0 vz0Var = null;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                String str4 = (String) obj;
                str4.getClass();
                ((si) this.receiver).getClass();
                si.b.d(str4);
                return pn6Var;
            case 1:
                String str5 = (String) obj;
                str5.getClass();
                ((si) this.receiver).getClass();
                si.b.d(str5);
                return pn6Var;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hm5 hm5Var = (hm5) this.receiver;
                sx5 sx5Var = hm5Var.j;
                while (true) {
                    Object value4 = sx5Var.getValue();
                    boolean z4 = booleanValue;
                    if (sx5Var.j(value4, xm6.a((xm6) value4, false, false, null, booleanValue, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435447))) {
                        tl7.z(zz.J(hm5Var), null, null, new em5(hm5Var, z4, null, (byte) 8), 3);
                        return pn6Var;
                    }
                    booleanValue = z4;
                }
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                hm5 hm5Var2 = (hm5) this.receiver;
                sx5 sx5Var2 = hm5Var2.j;
                while (true) {
                    Object value5 = sx5Var2.getValue();
                    boolean z5 = booleanValue2;
                    if (sx5Var2.j(value5, xm6.a((xm6) value5, false, false, null, false, booleanValue2, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435439))) {
                        tl7.z(zz.J(hm5Var2), null, null, new em5(hm5Var2, z5, null, (byte) 3), 3);
                        return pn6Var;
                    }
                    booleanValue2 = z5;
                }
            case 4:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                hm5 hm5Var3 = (hm5) this.receiver;
                sx5 sx5Var3 = hm5Var3.j;
                while (true) {
                    Object value6 = sx5Var3.getValue();
                    boolean z6 = booleanValue3;
                    if (sx5Var3.j(value6, xm6.a((xm6) value6, false, false, null, false, false, booleanValue3, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435423))) {
                        tl7.z(zz.J(hm5Var3), null, null, new em5(hm5Var3, z6, null, (byte) 5), 3);
                        return pn6Var;
                    }
                    booleanValue3 = z6;
                }
            case 5:
                HoldAction holdAction = (HoldAction) obj;
                holdAction.getClass();
                hm5 hm5Var4 = (hm5) this.receiver;
                hm5Var4.getClass();
                sx5 sx5Var4 = hm5Var4.j;
                while (true) {
                    Object value7 = sx5Var4.getValue();
                    HoldAction holdAction2 = holdAction;
                    if (sx5Var4.j(value7, xm6.a((xm6) value7, false, false, null, false, false, false, holdAction, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435391))) {
                        tl7.z(zz.J(hm5Var4), null, null, new e52(hm5Var4, holdAction2, null, (byte) 22), 3);
                        return pn6Var;
                    }
                    holdAction = holdAction2;
                }
            case 6:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                hm5 hm5Var5 = (hm5) this.receiver;
                sx5 sx5Var5 = hm5Var5.j;
                while (true) {
                    Object value8 = sx5Var5.getValue();
                    boolean z7 = booleanValue4;
                    if (sx5Var5.j(value8, xm6.a((xm6) value8, false, false, null, false, false, false, null, booleanValue4, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435327))) {
                        tl7.z(zz.J(hm5Var5), null, null, new em5(hm5Var5, z7, null, b2), 3);
                        return pn6Var;
                    }
                    booleanValue4 = z7;
                }
            case 7:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                hm5 hm5Var6 = (hm5) this.receiver;
                sx5 sx5Var6 = hm5Var6.j;
                while (true) {
                    Object value9 = sx5Var6.getValue();
                    boolean z8 = booleanValue5;
                    if (sx5Var6.j(value9, xm6.a((xm6) value9, false, false, null, false, false, false, null, false, booleanValue5, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268435199))) {
                        tl7.z(zz.J(hm5Var6), null, null, new em5(hm5Var6, z8, null, (byte) 7), 3);
                        return pn6Var;
                    }
                    booleanValue5 = z8;
                }
            case 8:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                hm5 hm5Var7 = (hm5) this.receiver;
                sx5 sx5Var7 = hm5Var7.j;
                if (((xm6) sx5Var7.getValue()).j) {
                    while (true) {
                        Object value10 = sx5Var7.getValue();
                        xm6 xm6Var = (xm6) value10;
                        boolean z9 = booleanValue6;
                        if (sx5Var7.j(value10, xm6.a(xm6Var, false, false, null, false, false, false, null, false, false, booleanValue6, booleanValue6 ? xm6Var.l : false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268432383))) {
                            tl7.z(zz.J(hm5Var7), null, null, new fm5(hm5Var7, z9, null), 3);
                        } else {
                            booleanValue6 = z9;
                        }
                    }
                }
                return pn6Var;
            case 9:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                hm5 hm5Var8 = (hm5) this.receiver;
                sx5 sx5Var8 = hm5Var8.j;
                if (((xm6) sx5Var8.getValue()).j && ((xm6) sx5Var8.getValue()).k) {
                    while (true) {
                        Object value11 = sx5Var8.getValue();
                        boolean z10 = booleanValue7;
                        if (sx5Var8.j(value11, xm6.a((xm6) value11, false, false, null, false, false, false, null, false, false, false, booleanValue7, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, 268433407))) {
                            tl7.z(zz.J(hm5Var8), null, null, new em5(hm5Var8, z10, null, (byte) 1), 3);
                        } else {
                            booleanValue7 = z10;
                        }
                    }
                }
                return pn6Var;
            case 10:
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj;
                subtitleStyleSettings.getClass();
                ((hm5) this.receiver).e(subtitleStyleSettings);
                return pn6Var;
            case 11:
                long j = ((xc4) obj).a;
                u86 u86Var = (u86) this.receiver;
                u86Var.getClass();
                y86 y86Var = (y86) t80.C(u86Var, z86.a);
                if (y86Var != null) {
                    tl7.z(u86Var.O0(), null, null, new f0(u86Var, j, y86Var, new t86(u86Var, j), (vz0) null), 3);
                }
                return pn6Var;
            case 12:
                ((n86) this.receiver).b.a((ub2) obj);
                return pn6Var;
            case 13:
                KeyEvent keyEvent = ((g83) obj).a;
                la6 la6Var = (la6) this.receiver;
                md6 md6Var = la6Var.f;
                boolean z11 = la6Var.d;
                mq0 mq0Var = (lt5.n(keyEvent) && (a = la6Var.i.a(keyEvent)) != null) ? new mq0(new StringBuilder().appendCodePoint(a.intValue()).toString(), 1) : null;
                if (mq0Var != null) {
                    if (z11) {
                        la6Var.a(te4.H(mq0Var));
                        md6Var.a = null;
                        z3 = true;
                    }
                } else if (h41.E(keyEvent) == 2 && (t = x97.E.t(keyEvent)) != null && (!t.x || z11)) {
                    ?? obj2 = new Object();
                    obj2.x = true;
                    ?? bgVar = new bg((Object) t, (Object) la6Var, (Object) obj2, (byte) 28);
                    mc6 mc6Var = la6Var.c;
                    wa6 wa6Var = new wa6(mc6Var, la6Var.g, la6Var.a.d(), md6Var);
                    bgVar.invoke(wa6Var);
                    boolean c = nd6.c(wa6Var.f, mc6Var.b);
                    ko koVar = wa6Var.g;
                    if (!c || !a34.i(koVar, mc6Var.a)) {
                        la6Var.j.invoke(mc6.a(mc6Var, koVar, wa6Var.f, 4));
                    }
                    la6Var.h.e = true;
                    z3 = obj2.x;
                }
                return Boolean.valueOf(z3);
            case 14:
                WatchSession watchSession = (WatchSession) obj;
                watchSession.getClass();
                v27 v27Var = (v27) this.receiver;
                v27Var.getClass();
                sx5 sx5Var9 = v27Var.n;
                ym6 ym6Var3 = (ym6) sx5Var9.getValue();
                WatchSession watchSession2 = ym6Var3.a;
                if (!a34.i(watchSession2 != null ? watchSession2.getAnimeId() : null, watchSession.getAnimeId()) || (episode = ym6Var3.b) == null || episode.getNumber() != watchSession.getStartEpisodeNumber() || !a34.i(watchSession2.getOfflineSourceType(), watchSession.getOfflineSourceType()) || !a34.i(watchSession2.getOfflineAudioTrackKey(), watchSession.getOfflineAudioTrackKey())) {
                    v27Var.R();
                    bx5 bx5Var = v27Var.v;
                    if (bx5Var != null) {
                        bx5Var.l(null);
                    }
                    v27Var.D = null;
                    v27Var.C = 0L;
                    sx5 sx5Var10 = v27Var.o;
                    do {
                        value = sx5Var10.getValue();
                    } while (!sx5Var10.j(value, dq4.a((dq4) value, false, false, false, 0L, 0L, null, false, null, false, false, null, 2023)));
                    while (true) {
                        Object value12 = sx5Var9.getValue();
                        ym6 ym6Var4 = (ym6) value12;
                        if (a34.i(watchSession2 != null ? watchSession2.getAnimeId() : null, watchSession.getAnimeId())) {
                            resource = ym6Var4.u;
                        } else {
                            resource = Resource.Loading.INSTANCE;
                        }
                        Resource resource3 = resource;
                        if (a34.i(watchSession2 != null ? watchSession2.getAnimeId() : null, watchSession.getAnimeId())) {
                            list = ym6Var4.c;
                        } else {
                            list = nt1.x;
                        }
                        List list3 = list;
                        if (!watchSession.getEpisodes().isEmpty()) {
                            resource2 = new Resource.Success(watchSession.getEpisodes());
                        } else {
                            resource2 = Resource.Loading.INSTANCE;
                        }
                        Resource resource4 = resource2;
                        String offlineSourceType = watchSession.getOfflineSourceType();
                        if (offlineSourceType != null) {
                            z = offlineSourceType.equalsIgnoreCase("dub");
                        } else {
                            z = ym6Var4.h;
                        }
                        boolean z12 = z;
                        WatchSession watchSession3 = watchSession;
                        if (sx5Var9.j(value12, ym6.a(ym6Var4, watchSession, null, list3, null, null, null, null, z12, 0.0f, false, null, null, null, null, null, false, false, false, null, resource4, resource3, null, null, null, null, watchSession.getOfflineSourceType() != null, false, false, null, false, false, false, false, false, false, false, -35127440, 15))) {
                            String animeId = watchSession3.getAnimeId();
                            bx5 bx5Var2 = v27Var.u;
                            vz0 vz0Var2 = null;
                            if (bx5Var2 != null) {
                                bx5Var2.l(null);
                            }
                            v27Var.u = tl7.z(zz.J(v27Var), null, null, new b27(v27Var, animeId, vz0Var2, (byte) 1), 3);
                            if (watchSession3.getEpisodes().isEmpty()) {
                                String animeId2 = watchSession3.getAnimeId();
                                animeId2.getClass();
                                bx5 bx5Var3 = v27Var.v;
                                if (bx5Var3 != null) {
                                    bx5Var3.l(null);
                                }
                                v27Var.v = tl7.z(zz.J(v27Var), null, null, new b27(v27Var, animeId2, vz0Var2, z3 ? (byte) 1 : (byte) 0), 3);
                            } else {
                                v27.u(v27Var, watchSession3.getStartEpisodeNumber());
                            }
                            bx5 bx5Var4 = v27Var.r;
                            if (bx5Var4 != null) {
                                bx5Var4.l(null);
                            }
                            v27Var.r = tl7.z(zz.J(v27Var), null, null, new vz6(v27Var, vz0Var2, (byte) 14), 3);
                            bx5 bx5Var5 = v27Var.s;
                            if (bx5Var5 != null) {
                                bx5Var5.l(null);
                            }
                            v27Var.s = tl7.z(zz.J(v27Var), null, null, new vz6(v27Var, vz0Var2, (byte) 13), 3);
                            bx5 bx5Var6 = v27Var.w;
                            if (bx5Var6 != null) {
                                bx5Var6.l(null);
                            }
                            v27Var.w = tl7.z(zz.J(v27Var), null, null, new d27(v27Var, watchSession3, vz0Var2, (byte) 1), 3);
                            bx5 bx5Var7 = v27Var.x;
                            if (bx5Var7 != null) {
                                bx5Var7.l(null);
                            }
                            v27Var.x = tl7.z(zz.J(v27Var), null, null, new d27(v27Var, watchSession3, vz0Var2, z3 ? (byte) 1 : (byte) 0), 3);
                            bx5 bx5Var8 = v27Var.y;
                            if (bx5Var8 != null) {
                                bx5Var8.l(null);
                            }
                            v27Var.y = tl7.z(zz.J(v27Var), null, null, new d27(v27Var, watchSession3, vz0Var2, b2), 3);
                        } else {
                            watchSession = watchSession3;
                        }
                    }
                }
                return pn6Var;
            case 15:
                zw zwVar = (zw) obj;
                zwVar.getClass();
                v27 v27Var2 = (v27) this.receiver;
                v27Var2.getClass();
                tv tvVar = v27Var2.T;
                String str6 = zwVar.b;
                String str7 = zwVar.c;
                sx5 sx5Var11 = v27Var2.n;
                ym6 ym6Var5 = (ym6) sx5Var11.getValue();
                if (!ym6Var5.z) {
                    tvVar.x = null;
                    String str8 = zwVar.d;
                    if (str8 != null) {
                        Episode episode3 = ym6Var5.b;
                        if (episode3 != null) {
                            boolean equals = str8.equals("dub");
                            long j2 = v27Var2.j();
                            if (str7 == null) {
                                str = equals ? "en" : "ja";
                            } else {
                                str = str7;
                            }
                            v27Var2.Z(str);
                            do {
                                value2 = sx5Var11.getValue();
                                ym6Var = (ym6) value2;
                                if (str7 == null) {
                                    str2 = equals ? "en" : "ja";
                                } else {
                                    str2 = str7;
                                }
                            } while (!sx5Var11.j(value2, ym6.a(ym6Var, null, null, null, null, null, null, null, equals, 0.0f, false, null, null, nt1.x, null, str2, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -28801, 15)));
                            int number = episode3.getNumber();
                            Long valueOf = Long.valueOf(j2);
                            tvVar.x = null;
                            v27.w(v27Var2, number, valueOf, false, null, 56);
                        }
                    } else if (ym6Var5.g()) {
                        if (((dq4) v27Var2.o.getValue()).j) {
                            List list4 = ym6Var5.m;
                            if (list4 == null || !list4.isEmpty()) {
                                Iterator it = list4.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((zw) it.next()).a.equals(zwVar.a)) {
                                            bx3 n = v27Var2.n();
                                            MediaInfo mediaInfo = n != null ? n.x : null;
                                            if (mediaInfo == null || (list2 = mediaInfo.C) == null) {
                                                mediaTrack = null;
                                            } else {
                                                Iterator it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        mediaTrack2 = it2.next();
                                                        MediaTrack mediaTrack3 = (MediaTrack) mediaTrack2;
                                                        if (mediaTrack3.y == 2) {
                                                            long j3 = mediaTrack3.x;
                                                            Long l = zwVar.g;
                                                            if (l != null && j3 == l.longValue()) {
                                                            }
                                                        }
                                                    } else {
                                                        mediaTrack2 = 0;
                                                    }
                                                }
                                                mediaTrack = mediaTrack2;
                                            }
                                            while (true) {
                                                Object value13 = sx5Var11.getValue();
                                                zw zwVar2 = zwVar;
                                                if (sx5Var11.j(value13, ym6.a((ym6) value13, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, zwVar2, str7 == null ? str6 : str7, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -24577, 15))) {
                                                    if (str7 != null) {
                                                        str6 = str7;
                                                    }
                                                    v27Var2.Z(str6);
                                                    if (mediaTrack != null) {
                                                        long[] jArr = n.H;
                                                        if (jArr == null) {
                                                            jArr = new long[0];
                                                        }
                                                        if (ms.s0(jArr, mediaTrack.x)) {
                                                            z2 = false;
                                                            v27Var2.Q = z2;
                                                            v27Var2.R = false;
                                                            v27Var2.f0 = (mediaInfo != null || mediaTrack == null) ? null : new u17(mediaTrack.x, n.z, mediaInfo.c());
                                                            v27Var2.e0 = null;
                                                            if (mediaTrack == null && ((i = n.B) == 2 || i == 3)) {
                                                                v27Var2.S();
                                                                if (v27Var2.Q) {
                                                                    v27Var2.g();
                                                                }
                                                            } else {
                                                                v27Var2.D();
                                                            }
                                                        }
                                                    }
                                                    z2 = true;
                                                    v27Var2.Q = z2;
                                                    v27Var2.R = false;
                                                    v27Var2.f0 = (mediaInfo != null || mediaTrack == null) ? null : new u17(mediaTrack.x, n.z, mediaInfo.c());
                                                    v27Var2.e0 = null;
                                                    if (mediaTrack == null) {
                                                    }
                                                    v27Var2.D();
                                                } else {
                                                    zwVar = zwVar2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            zw zwVar3 = zwVar;
                            while (true) {
                                Object value14 = sx5Var11.getValue();
                                zw zwVar4 = zwVar3;
                                if (sx5Var11.j(value14, ym6.a((ym6) value14, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, zwVar3, str7 == null ? str6 : str7, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -24577, 15))) {
                                    v27Var2.X();
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    v27Var2.Z(str6);
                                    v27Var2.e(zwVar4);
                                } else {
                                    zwVar3 = zwVar4;
                                }
                            }
                        }
                    }
                }
                return pn6Var;
            case 16:
                float floatValue = ((Number) obj).floatValue();
                v27 v27Var3 = (v27) this.receiver;
                v27Var3.l.c(floatValue);
                sx5 sx5Var12 = v27Var3.n;
                while (true) {
                    Object value15 = sx5Var12.getValue();
                    float f = floatValue;
                    if (sx5Var12.j(value15, ym6.a((ym6) value15, null, null, null, null, null, null, null, false, f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -257, 15))) {
                        return pn6Var;
                    }
                    floatValue = f;
                }
            case 17:
                boolean booleanValue8 = ((Boolean) obj).booleanValue();
                v27 v27Var4 = (v27) this.receiver;
                sx5 sx5Var13 = v27Var4.n;
                while (true) {
                    Object value16 = sx5Var13.getValue();
                    boolean z13 = booleanValue8;
                    if (sx5Var13.j(value16, ym6.a((ym6) value16, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, booleanValue8, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -65537, 15))) {
                        tl7.z(zz.J(v27Var4), null, null, new u27(v27Var4, z13, vz0Var, b2), 3);
                        return pn6Var;
                    }
                    booleanValue8 = z13;
                }
            case 18:
                boolean booleanValue9 = ((Boolean) obj).booleanValue();
                v27 v27Var5 = (v27) this.receiver;
                sx5 sx5Var14 = v27Var5.n;
                while (true) {
                    Object value17 = sx5Var14.getValue();
                    boolean z14 = booleanValue9;
                    if (sx5Var14.j(value17, ym6.a((ym6) value17, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, booleanValue9, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -131073, 15))) {
                        tl7.z(zz.J(v27Var5), null, null, new u27(v27Var5, z14, vz0Var, z3 ? (byte) 1 : (byte) 0), 3);
                        return pn6Var;
                    }
                    booleanValue9 = z14;
                }
            case 19:
                String str9 = (String) obj;
                str9.getClass();
                v27 v27Var6 = (v27) this.receiver;
                sx5 sx5Var15 = v27Var6.o;
                sx5 sx5Var16 = v27Var6.n;
                Episode episode4 = ((ym6) sx5Var16.getValue()).b;
                if (episode4 != null) {
                    long j4 = v27Var6.j();
                    if (((dq4) sx5Var15.getValue()).j && (episode2 = (ym6Var2 = (ym6) sx5Var16.getValue()).b) != null) {
                        v27Var6.J = new v17(episode2.getNumber(), ym6Var2.h);
                        v27Var6.L.clear();
                    }
                    v27Var6.U.clear();
                    if (!((dq4) sx5Var15.getValue()).j || (str3 = v27Var6.l(str9)) == null) {
                        str3 = str9;
                    }
                    v27Var6.a0(str3);
                    while (true) {
                        Object value18 = sx5Var16.getValue();
                        String str10 = str3;
                        if (sx5Var16.j(value18, ym6.a((ym6) value18, null, null, null, null, str10, null, null, false, 0.0f, false, null, null, nt1.x, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -12305, 15))) {
                            if (!str10.equals(str9)) {
                                v27Var6.x(str9, str10);
                            }
                            long j5 = j4;
                            int number2 = episode4.getNumber();
                            Long valueOf2 = Long.valueOf(j5);
                            v27Var6.T.x = null;
                            v27.w(v27Var6, number2, valueOf2, false, null, 56);
                        } else {
                            str3 = str10;
                            j4 = j4;
                        }
                    }
                }
                return pn6Var;
            case 20:
                return d(obj);
            case 21:
                return h(obj);
            case 22:
                String str11 = (String) obj;
                str11.getClass();
                v27 v27Var7 = (v27) this.receiver;
                v27Var7.getClass();
                tl7.z(zz.J(v27Var7), null, null, new t27(v27Var7, str11, vz0Var, b3), 3);
                return pn6Var;
            case 23:
                ((v27) this.receiver).P(((Boolean) obj).booleanValue());
                return pn6Var;
            case 24:
                boolean booleanValue10 = ((Boolean) obj).booleanValue();
                v27 v27Var8 = (v27) this.receiver;
                sx5 sx5Var17 = v27Var8.n;
                while (true) {
                    Object value19 = sx5Var17.getValue();
                    boolean z15 = booleanValue10;
                    if (sx5Var17.j(value19, ym6.a((ym6) value19, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, booleanValue10, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -32769, 15))) {
                        tl7.z(zz.J(v27Var8), null, null, new u27(v27Var8, z15, vz0Var, b3), 3);
                        return pn6Var;
                    }
                    booleanValue10 = z15;
                }
            case 25:
                ((v27) this.receiver).Q(((Boolean) obj).booleanValue());
                return pn6Var;
            case 26:
                ((v27) this.receiver).O(((Boolean) obj).booleanValue());
                return pn6Var;
            case 27:
                return i(obj);
            case 28:
                ((v27) this.receiver).K(((Number) obj).longValue());
                return pn6Var;
            default:
                boolean booleanValue11 = ((Boolean) obj).booleanValue();
                sx5 sx5Var18 = ((v27) this.receiver).o;
                do {
                    value3 = sx5Var18.getValue();
                } while (!sx5Var18.j(value3, dq4.a((dq4) value3, false, false, false, 0L, 0L, null, booleanValue11, null, false, false, null, 1983)));
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nl5(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }
}

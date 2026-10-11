package defpackage;

import android.content.ClipDescription;
import android.graphics.drawable.Drawable;
import com.anistation.model.CoverImage;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.Title;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.watch.Source;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.Track;
import com.anistation.model.watch.WatchSession;
import com.discord.org.webrtc.PeerConnection;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.core.di.UnityAdsModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pp5 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pp5(pp5 pp5Var, nl5 nl5Var) {
        this.x = (byte) 9;
        this.y = pp5Var;
    }

    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, oa0] */
    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        pn6 publicApiJob$lambda$1$lambda$0;
        Episode episode;
        SourcesResponse sourcesResponse;
        Source source;
        Resource.Success success;
        Info info;
        Title title;
        String str;
        OfflineDownloadMetadata metadata;
        OfflineDownloadMetadata metadata2;
        CoverImage coverImage;
        String str2;
        String str3;
        String str4;
        String str5;
        CoverImage coverImage2;
        OfflineDownloadMetadata metadata3;
        OfflineDownloadMetadata metadata4;
        Episode episode2;
        SourcesResponse sourcesResponse2;
        boolean z;
        Source source2;
        Resource.Success success2;
        Info info2;
        Title title2;
        String str6;
        String str7;
        OfflineDownloadMetadata metadata5;
        OfflineDownloadMetadata metadata6;
        CoverImage coverImage3;
        String str8;
        String str9;
        String str10;
        String str11;
        CoverImage coverImage4;
        OfflineDownloadMetadata metadata7;
        OfflineDownloadMetadata metadata8;
        byte b = this.x;
        int i = 0;
        r6 = false;
        boolean z2 = false;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                qp5 qp5Var = (qp5) obj2;
                p55 p55Var = (p55) obj;
                p55Var.h(qp5Var.L);
                p55Var.i(qp5Var.M);
                p55Var.c(qp5Var.N);
                float f = qp5Var.O;
                if (p55Var.B != f) {
                    p55Var.x |= 8;
                    p55Var.B = f;
                }
                p55Var.n(qp5Var.P);
                p55Var.j(qp5Var.Q);
                float f2 = qp5Var.R;
                if (p55Var.G != f2) {
                    p55Var.x |= 256;
                    p55Var.G = f2;
                }
                float f3 = qp5Var.S;
                if (p55Var.H != f3) {
                    p55Var.x |= 512;
                    p55Var.H = f3;
                }
                float f4 = qp5Var.T;
                if (p55Var.I != f4) {
                    p55Var.x |= 1024;
                    p55Var.I = f4;
                }
                float f5 = qp5Var.U;
                if (p55Var.J != f5) {
                    p55Var.x |= 2048;
                    p55Var.J = f5;
                }
                p55Var.m(qp5Var.V);
                p55Var.k(qp5Var.W);
                p55Var.e(qp5Var.X);
                p55Var.f(qp5Var.Y);
                p55Var.d(qp5Var.Z);
                p55Var.l(qp5Var.a0);
                int i2 = qp5Var.b0;
                if (p55Var.N != i2) {
                    p55Var.x |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    p55Var.N = i2;
                }
                int i3 = qp5Var.c0;
                if (p55Var.U != i3) {
                    p55Var.x |= 524288;
                    p55Var.U = i3;
                }
                w60 w60Var = qp5Var.d0;
                if (!a34.i(p55Var.T, w60Var)) {
                    p55Var.x |= 262144;
                    p55Var.T = w60Var;
                }
                ca3 ca3Var = qp5Var.e0;
                if (!a34.i(p55Var.P, ca3Var)) {
                    p55Var.x |= 1048576;
                    p55Var.P = ca3Var;
                }
                return pn6.a;
            case 1:
                iq5 iq5Var = (iq5) obj2;
                ki5 ki5Var = iq5Var.C;
                ki5Var.getClass();
                if (!a34.i(iq5Var.C, ki5Var)) {
                    ds4.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                q44 q44Var = iq5Var.B;
                Object obj3 = iq5Var.z;
                if (q44Var == null) {
                    if (obj3 == null) {
                        iq5Var.z = obj;
                    } else {
                        q44 q44Var2 = db5.a;
                        q44 q44Var3 = new q44();
                        q44Var3.a(obj3);
                        q44Var3.a(obj);
                        iq5Var.B = q44Var3;
                        iq5Var.z = null;
                    }
                } else {
                    if (obj3 != null) {
                        ds4.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    q44Var.a(obj);
                }
                return pn6.a;
            case 2:
                return Integer.valueOf(((yr5) obj2).b(tl7.h(((k14) obj).e)));
            case 3:
                eu5 eu5Var = (eu5) obj2;
                synchronized (eu5Var.g) {
                    du5 du5Var = eu5Var.i;
                    du5Var.getClass();
                    Object obj4 = du5Var.b;
                    obj4.getClass();
                    int i4 = du5Var.d;
                    b44 b44Var = du5Var.c;
                    if (b44Var == null) {
                        b44Var = new b44();
                        du5Var.c = b44Var;
                        du5Var.f.n(obj4, b44Var);
                    }
                    du5Var.b(obj, i4, obj4, b44Var);
                }
                return pn6.a;
            case 4:
                ((ju5) obj2).k0();
                return pn6.a;
            case 5:
                g56 g56Var = (g56) obj2;
                qq5 qq5Var = (qq5) obj;
                qq5Var.getClass();
                kz kzVar = g56Var.x;
                List list = (List) kzVar.A;
                byte[] bArr = g56Var.B;
                String str12 = (String) kzVar.B;
                bArr.getClass();
                oa0 oa0Var = (oa0) qq5Var;
                oa0Var.u0((short) 771);
                db.u0(qq5Var, bArr, 0, bArr.length);
                oa0Var.l0((byte) 32);
                db.u0(qq5Var, new byte[32], 0, 32);
                oa0Var.u0((short) (list.size() * 2));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    oa0Var.u0(((cm0) it.next()).a);
                }
                oa0Var.l0((byte) 1);
                oa0Var.l0((byte) 0);
                ArrayList arrayList = new ArrayList();
                List<wj2> list2 = po5.a;
                ?? obj5 = new Object();
                obj5.u0((short) 13);
                int size = list2.size() * 2;
                obj5.u0((short) (size + 2));
                obj5.u0((short) size);
                for (wj2 wj2Var : list2) {
                    obj5.l0(wj2Var.a.x);
                    obj5.l0(wj2Var.b.x);
                }
                arrayList.add(obj5);
                List list3 = p64.a;
                ?? obj6 = new Object();
                if (list3.size() <= 16382) {
                    obj6.u0((short) 10);
                    int size2 = list3.size() * 2;
                    obj6.u0((short) (size2 + 2));
                    obj6.u0((short) size2);
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        obj6.u0(((o64) it2.next()).x);
                    }
                    arrayList.add(obj6);
                    List list4 = mq4.a;
                    ?? obj7 = new Object();
                    obj7.u0((short) 11);
                    int size3 = list4.size();
                    obj7.u0((short) (size3 + 1));
                    obj7.l0((byte) size3);
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        obj7.l0(((lq4) it3.next()).x);
                    }
                    arrayList.add(obj7);
                    if (str12 != null) {
                        ?? obj8 = new Object();
                        if (str12.length() < 32762) {
                            obj8.u0((short) 0);
                            obj8.u0((short) (str12.length() + 5));
                            obj8.u0((short) (str12.length() + 3));
                            obj8.l0((byte) 0);
                            obj8.u0((short) str12.length());
                            et5.m(obj8, str12, 0, 14);
                            arrayList.add(obj8);
                        } else {
                            ze0.k("Server name length limit exceeded: at most 32762 characters allowed");
                        }
                    }
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        Object obj9 = arrayList.get(i5);
                        i5++;
                        i += (int) sw0.w((cv5) obj9);
                    }
                    oa0Var.u0((short) i);
                    Iterator it4 = arrayList.iterator();
                    it4.getClass();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        next.getClass();
                        db.w0(qq5Var, (cv5) next);
                    }
                    return pn6.a;
                }
                ze0.k("Too many named curves provided: at most 16382 could be provided");
                return null;
            case 6:
                ((y56) obj2).y.close();
                return pn6.a;
            case 7:
                Drawable drawable = (Drawable) obj2;
                bp1 bp1Var = (bp1) obj;
                vg0 y = bp1Var.n0().y();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (bp1Var.g() >> 32)), (int) Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)));
                drawable.draw(u9.a(y));
                return pn6.a;
            case 8:
                ((ub2) obj).invoke((n86) obj2);
                return pn6.a;
            case 9:
                pp5 pp5Var = (pp5) obj2;
                jj6 jj6Var = (jj6) obj;
                if (jj6Var instanceof q6) {
                    pp5Var.invoke(((q6) jj6Var).L);
                    return Boolean.TRUE;
                }
                ze0.m("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 10:
                u96 u96Var = (u96) obj2;
                ha3 ha3Var = (ha3) obj;
                n05 n05Var = (n05) u96Var.R.x.getValue();
                if (n05Var == null) {
                    n05Var = n05.e;
                }
                ha3 e = u96Var.P.e();
                if (e != null) {
                    return x97.W(n05Var, e, ha3Var);
                }
                hz2.d("Required value was null.");
                v71.e();
                return null;
            case 11:
                ClipDescription clipDescription = ((an1) obj).a.getClipDescription();
                Iterable<ex3> iterable = (Iterable) ((z96) obj2).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (ex3 ex3Var : iterable) {
                        if (a34.i(ex3Var, ex3.c) || (clipDescription != null && clipDescription.hasMimeType(ex3Var.a))) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 12:
                cb6 cb6Var = (cb6) obj2;
                float floatValue = ((Float) obj).floatValue();
                pi4 pi4Var = cb6Var.a;
                float h = pi4Var.h() + floatValue;
                pi4 pi4Var2 = cb6Var.b;
                if (h > pi4Var2.h()) {
                    floatValue = pi4Var2.h() - pi4Var.h();
                } else if (h < 0.0f) {
                    floatValue = -pi4Var.h();
                }
                pi4Var.i(pi4Var.h() + floatValue);
                return Float.valueOf(floatValue);
            case 13:
                id6 id6Var = (id6) obj2;
                jo joVar = (jo) obj;
                go goVar = (go) joVar.a;
                if (goVar instanceof uh3) {
                    uh3 uh3Var = (uh3) goVar;
                    if (uh3Var.b == null) {
                        return jo.a(joVar, new uh3(uh3Var.a, id6Var), 0, 0, 14);
                    }
                }
                if (goVar instanceof th3) {
                    th3 th3Var = (th3) goVar;
                    if (th3Var.b == null) {
                        return jo.a(joVar, new th3(th3Var.a, id6Var), 0, 0, 14);
                    }
                    return joVar;
                }
                return joVar;
            case 14:
                dk6 dk6Var = (dk6) obj2;
                jm0 jm0Var = (jm0) obj;
                jm0Var.getClass();
                jm0.a(jm0Var, "first", dk6Var.a.getDescriptor());
                jm0.a(jm0Var, "second", dk6Var.b.getDescriptor());
                jm0.a(jm0Var, "third", dk6Var.c.getDescriptor());
                return pn6.a;
            case 15:
                publicApiJob$lambda$1$lambda$0 = UnityAdsModule.publicApiJob$lambda$1$lambda$0((DiagnosticEventRepository) obj2, (Throwable) obj);
                return publicApiJob$lambda$1$lambda$0;
            case 16:
                jw6 a = ((kw6) obj2).a();
                iw6 iw6Var = (iw6) a.b.g(obj);
                if (iw6Var != null) {
                    iw6Var.d = true;
                    if (iw6Var.c <= 0) {
                        a.e(obj);
                    }
                }
                return pn6.a;
            case 17:
                return ((Episode) ((List) obj2).get(((Integer) obj).intValue())).getId();
            case 18:
                v27 v27Var = (v27) obj2;
                za0 za0Var = v27Var.p;
                sx5 sx5Var = v27Var.n;
                uk4 uk4Var = (uk4) obj;
                String str13 = "ja";
                nt1 nt1Var = nt1.x;
                String str14 = "sub";
                uk4Var.getClass();
                String str15 = uk4Var.b;
                int ordinal = uk4Var.a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ym6 ym6Var = (ym6) sx5Var.getValue();
                        WatchSession watchSession = ym6Var.a;
                        EpisodeDownload episodeDownload = ym6Var.y;
                        EpisodeDownload episodeDownload2 = ym6Var.x;
                        boolean z3 = ym6Var.h;
                        if (watchSession != null && (episode2 = ym6Var.b) != null) {
                            SourcesResponse sourcesResponse3 = ym6Var.d;
                            if (sourcesResponse3 != null) {
                                SourcesResponse U = v27.U(sourcesResponse3);
                                if (U != null) {
                                    sourcesResponse3 = U;
                                }
                                sourcesResponse2 = sourcesResponse3;
                            } else {
                                sourcesResponse2 = null;
                            }
                            if (sourcesResponse2 != null) {
                                source2 = v27.L(sourcesResponse2);
                                z = z3;
                            } else {
                                z = z3;
                                source2 = null;
                            }
                            if (sourcesResponse2 != null && source2 != null) {
                                Resource resource = ym6Var.u;
                                if (resource instanceof Resource.Success) {
                                    success2 = (Resource.Success) resource;
                                } else {
                                    success2 = null;
                                }
                                if (success2 != null) {
                                    info2 = (Info) success2.getData();
                                } else {
                                    info2 = null;
                                }
                                if (info2 != null) {
                                    title2 = info2.getTitle();
                                } else {
                                    title2 = null;
                                }
                                String b2 = e02.b(title2);
                                if (uz5.V(b2)) {
                                    b2 = null;
                                }
                                if (b2 == null) {
                                    if (episodeDownload2 != null && (metadata8 = episodeDownload2.getMetadata()) != null) {
                                        b2 = metadata8.getAnimeTitle();
                                    } else {
                                        b2 = null;
                                    }
                                    if (b2 == null) {
                                        if (episodeDownload != null && (metadata7 = episodeDownload.getMetadata()) != null) {
                                            b2 = metadata7.getAnimeTitle();
                                        } else {
                                            b2 = null;
                                        }
                                        if (b2 == null) {
                                            b2 = qx1.h(watchSession.getAnilistId(), "Anime ");
                                        }
                                    }
                                }
                                if (info2 == null || (coverImage4 = info2.getCoverImage()) == null || (str6 = coverImage4.getExtraLarge()) == null) {
                                    if (info2 != null && (coverImage3 = info2.getCoverImage()) != null) {
                                        str6 = coverImage3.getLarge();
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        if (episodeDownload2 != null && (metadata6 = episodeDownload2.getMetadata()) != null) {
                                            str7 = metadata6.getCoverImage();
                                        } else {
                                            str7 = null;
                                        }
                                        if (str7 == null) {
                                            if (episodeDownload != null && (metadata5 = episodeDownload.getMetadata()) != null) {
                                                str7 = metadata5.getCoverImage();
                                            } else {
                                                str6 = null;
                                            }
                                        }
                                        str6 = str7;
                                    }
                                }
                                if (z) {
                                    str14 = "dub";
                                }
                                Track track = ym6Var.k;
                                if (track == null) {
                                    List<Track> tracks = sourcesResponse2.getTracks();
                                    if (tracks == null) {
                                        tracks = nt1Var;
                                    }
                                    track = h98.R(ym6Var.l, tracks);
                                }
                                Track track2 = track;
                                zw f6 = ym6Var.f();
                                if (f6 != null && (str11 = f6.c) != null) {
                                    str8 = str11;
                                } else {
                                    if (f6 != null) {
                                        str13 = f6.b;
                                    } else if (z) {
                                        str8 = "en";
                                    }
                                    str8 = str13;
                                }
                                if (f6 != null && (str10 = f6.b) != null) {
                                    str9 = str10;
                                } else if (!z) {
                                    str9 = "Japanese";
                                } else {
                                    str9 = "English";
                                }
                                tl7.z(zz.J(v27Var), null, null, new z17(v27Var, watchSession, episode2, b2, str6, info2, ym6Var, str14, source2, sourcesResponse2, track2, str8, str9, str15, null, (byte) 1), 3);
                            } else {
                                za0Var.i(new s17("Download source is unavailable."));
                            }
                        }
                    } else {
                        ze0.l();
                        return null;
                    }
                } else {
                    ym6 ym6Var2 = (ym6) sx5Var.getValue();
                    WatchSession watchSession2 = ym6Var2.a;
                    EpisodeDownload episodeDownload3 = ym6Var2.y;
                    EpisodeDownload episodeDownload4 = ym6Var2.x;
                    boolean z4 = ym6Var2.h;
                    if (watchSession2 != null && (episode = ym6Var2.b) != null) {
                        SourcesResponse sourcesResponse4 = ym6Var2.d;
                        if (sourcesResponse4 != null) {
                            SourcesResponse U2 = v27.U(sourcesResponse4);
                            if (U2 != null) {
                                sourcesResponse4 = U2;
                            }
                            sourcesResponse = sourcesResponse4;
                        } else {
                            sourcesResponse = null;
                        }
                        if (sourcesResponse != null) {
                            source = v27.L(sourcesResponse);
                        } else {
                            source = null;
                        }
                        if (sourcesResponse != null && source != null) {
                            Resource resource2 = ym6Var2.u;
                            if (resource2 instanceof Resource.Success) {
                                success = (Resource.Success) resource2;
                            } else {
                                success = null;
                            }
                            if (success != null) {
                                info = (Info) success.getData();
                            } else {
                                info = null;
                            }
                            if (info != null) {
                                title = info.getTitle();
                            } else {
                                title = null;
                            }
                            String b3 = e02.b(title);
                            if (uz5.V(b3)) {
                                b3 = null;
                            }
                            if (b3 == null) {
                                if (episodeDownload4 != null && (metadata4 = episodeDownload4.getMetadata()) != null) {
                                    b3 = metadata4.getAnimeTitle();
                                } else {
                                    b3 = null;
                                }
                                if (b3 == null) {
                                    if (episodeDownload3 != null && (metadata3 = episodeDownload3.getMetadata()) != null) {
                                        b3 = metadata3.getAnimeTitle();
                                    } else {
                                        b3 = null;
                                    }
                                    if (b3 == null) {
                                        b3 = qx1.h(watchSession2.getAnilistId(), "Anime ");
                                    }
                                }
                            }
                            if (info == null || (coverImage2 = info.getCoverImage()) == null || (str = coverImage2.getExtraLarge()) == null) {
                                if (info != null && (coverImage = info.getCoverImage()) != null) {
                                    str = coverImage.getLarge();
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    if (episodeDownload4 != null && (metadata2 = episodeDownload4.getMetadata()) != null) {
                                        str = metadata2.getCoverImage();
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        if (episodeDownload3 != null && (metadata = episodeDownload3.getMetadata()) != null) {
                                            str = metadata.getCoverImage();
                                        } else {
                                            str = null;
                                        }
                                    }
                                }
                            }
                            if (z4) {
                                str14 = "dub";
                            }
                            Track track3 = ym6Var2.k;
                            if (track3 == null) {
                                List<Track> tracks2 = sourcesResponse.getTracks();
                                if (tracks2 == null) {
                                    tracks2 = nt1Var;
                                }
                                track3 = h98.R(ym6Var2.l, tracks2);
                            }
                            Track track4 = track3;
                            zw f7 = ym6Var2.f();
                            if (f7 != null && (str5 = f7.c) != null) {
                                str2 = str5;
                            } else {
                                if (f7 != null) {
                                    str13 = f7.b;
                                } else if (z4) {
                                    str2 = "en";
                                }
                                str2 = str13;
                            }
                            if (f7 != null && (str4 = f7.b) != null) {
                                str3 = str4;
                            } else if (!z4) {
                                str3 = "Japanese";
                            } else {
                                str3 = "English";
                            }
                            String str16 = str14;
                            tl7.z(zz.J(v27Var), null, null, new z17(v27Var, watchSession2, episode, b3, str, info, ym6Var2, str16, source, sourcesResponse, track4, str2, str3, str15, null, (byte) 0), 3);
                        } else {
                            za0Var.i(new s17("Download source is unavailable."));
                        }
                    }
                }
                return pn6.a;
            default:
                ((ci1) obj).getClass();
                return new i5((r07) obj2, (byte) 16);
        }
    }

    public /* synthetic */ pp5(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}

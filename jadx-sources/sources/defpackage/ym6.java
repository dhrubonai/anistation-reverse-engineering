package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.Resource;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineDownloadMetadataKt;
import com.anistation.model.download.OfflineSubtitleMetadata;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.watch.Server;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.Track;
import com.anistation.model.watch.WatchSession;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ym6 {
    public final boolean A;
    public final boolean B;
    public final AnimeListItem C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final WatchSession a;
    public final Episode b;
    public final List c;
    public final SourcesResponse d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final float i;
    public final boolean j;
    public final Track k;
    public final String l;
    public final List m;
    public final zw n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final SubtitleStyleSettings s;
    public final Resource t;
    public final Resource u;
    public final Server v;
    public final List w;
    public final EpisodeDownload x;
    public final EpisodeDownload y;
    public final boolean z;

    public ym6(WatchSession watchSession, Episode episode, List list, SourcesResponse sourcesResponse, String str, String str2, String str3, boolean z, float f, boolean z2, Track track, String str4, List list2, zw zwVar, String str5, boolean z3, boolean z4, boolean z5, SubtitleStyleSettings subtitleStyleSettings, Resource resource, Resource resource2, Server server, List list3, EpisodeDownload episodeDownload, EpisodeDownload episodeDownload2, boolean z6, boolean z7, boolean z8, AnimeListItem animeListItem, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        subtitleStyleSettings.getClass();
        resource.getClass();
        resource2.getClass();
        list3.getClass();
        this.a = watchSession;
        this.b = episode;
        this.c = list;
        this.d = sourcesResponse;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = f;
        this.j = z2;
        this.k = track;
        this.l = str4;
        this.m = list2;
        this.n = zwVar;
        this.o = str5;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = subtitleStyleSettings;
        this.t = resource;
        this.u = resource2;
        this.v = server;
        this.w = list3;
        this.x = episodeDownload;
        this.y = episodeDownload2;
        this.z = z6;
        this.A = z7;
        this.B = z8;
        this.C = animeListItem;
        this.D = z9;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
        this.J = z15;
    }

    public static ym6 a(ym6 ym6Var, WatchSession watchSession, Episode episode, List list, SourcesResponse sourcesResponse, String str, String str2, String str3, boolean z, float f, boolean z2, Track track, String str4, List list2, zw zwVar, String str5, boolean z3, boolean z4, boolean z5, SubtitleStyleSettings subtitleStyleSettings, Resource resource, Resource resource2, Server server, List list3, EpisodeDownload episodeDownload, EpisodeDownload episodeDownload2, boolean z6, boolean z7, boolean z8, AnimeListItem animeListItem, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i, int i2) {
        WatchSession watchSession2 = (i & 1) != 0 ? ym6Var.a : watchSession;
        Episode episode2 = (i & 2) != 0 ? ym6Var.b : episode;
        List list4 = (i & 4) != 0 ? ym6Var.c : list;
        SourcesResponse sourcesResponse2 = (i & 8) != 0 ? ym6Var.d : sourcesResponse;
        String str6 = (i & 16) != 0 ? ym6Var.e : str;
        String str7 = (i & 32) != 0 ? ym6Var.f : str2;
        String str8 = (i & 64) != 0 ? ym6Var.g : str3;
        boolean z16 = (i & 128) != 0 ? ym6Var.h : z;
        float f2 = (i & 256) != 0 ? ym6Var.i : f;
        boolean z17 = (i & 512) != 0 ? ym6Var.j : z2;
        Track track2 = (i & 1024) != 0 ? ym6Var.k : track;
        String str9 = (i & 2048) != 0 ? ym6Var.l : str4;
        List list5 = (i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? ym6Var.m : list2;
        zw zwVar2 = (i & 8192) != 0 ? ym6Var.n : zwVar;
        WatchSession watchSession3 = watchSession2;
        String str10 = (i & 16384) != 0 ? ym6Var.o : str5;
        boolean z18 = (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? ym6Var.p : z3;
        boolean z19 = (i & 65536) != 0 ? ym6Var.q : z4;
        boolean z20 = (i & 131072) != 0 ? ym6Var.r : z5;
        SubtitleStyleSettings subtitleStyleSettings2 = (i & 262144) != 0 ? ym6Var.s : subtitleStyleSettings;
        Resource resource3 = (i & 524288) != 0 ? ym6Var.t : resource;
        Resource resource4 = (i & 1048576) != 0 ? ym6Var.u : resource2;
        Server server2 = (i & 2097152) != 0 ? ym6Var.v : server;
        List list6 = (i & 4194304) != 0 ? ym6Var.w : list3;
        EpisodeDownload episodeDownload3 = (i & 8388608) != 0 ? ym6Var.x : episodeDownload;
        EpisodeDownload episodeDownload4 = (i & 16777216) != 0 ? ym6Var.y : episodeDownload2;
        boolean z21 = (i & 33554432) != 0 ? ym6Var.z : z6;
        boolean z22 = (i & 67108864) != 0 ? ym6Var.A : z7;
        boolean z23 = (i & 134217728) != 0 ? ym6Var.B : z8;
        AnimeListItem animeListItem2 = (i & 268435456) != 0 ? ym6Var.C : animeListItem;
        boolean z24 = (i & 536870912) != 0 ? ym6Var.D : z9;
        boolean z25 = (i & 1073741824) != 0 ? ym6Var.E : z10;
        boolean z26 = (i & Integer.MIN_VALUE) != 0 ? ym6Var.F : z11;
        boolean z27 = (i2 & 1) != 0 ? ym6Var.G : z12;
        boolean z28 = (i2 & 2) != 0 ? ym6Var.H : z13;
        boolean z29 = (i2 & 4) != 0 ? ym6Var.I : z14;
        boolean z30 = (i2 & 8) != 0 ? ym6Var.J : z15;
        ym6Var.getClass();
        list4.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        list5.getClass();
        str10.getClass();
        subtitleStyleSettings2.getClass();
        resource3.getClass();
        resource4.getClass();
        list6.getClass();
        return new ym6(watchSession3, episode2, list4, sourcesResponse2, str6, str7, str8, z16, f2, z17, track2, str9, list5, zwVar2, str10, z18, z19, z20, subtitleStyleSettings2, resource3, resource4, server2, list6, episodeDownload3, episodeDownload4, z21, z22, z23, animeListItem2, z24, z25, z26, z27, z28, z29, z30);
    }

    public final List b() {
        OfflineDownloadMetadata offlineDownloadMetadata;
        if (this.z) {
            EpisodeDownload episodeDownload = this.x;
            if (episodeDownload == null || (offlineDownloadMetadata = episodeDownload.getMetadata()) == null) {
                EpisodeDownload episodeDownload2 = this.y;
                if (episodeDownload2 != null) {
                    offlineDownloadMetadata = episodeDownload2.getMetadata();
                } else {
                    offlineDownloadMetadata = null;
                }
            }
            if (offlineDownloadMetadata != null) {
                return te4.H(new zw("offline_audio", OfflineDownloadMetadataKt.getAudioTrackLabel(offlineDownloadMetadata), OfflineDownloadMetadataKt.getAudioTrackKey(offlineDownloadMetadata), offlineDownloadMetadata.getSourceType(), null, null, null, 112));
            }
            return nt1.x;
        }
        if (g()) {
            return this.m;
        }
        return h98.T(this.v);
    }

    public final List c() {
        OfflineDownloadMetadata metadata;
        OfflineDownloadMetadata metadata2;
        OfflineSubtitleMetadata subtitle;
        boolean z = this.z;
        nt1 nt1Var = nt1.x;
        List<Track> list = null;
        r2 = null;
        OfflineSubtitleMetadata subtitle2 = null;
        if (z) {
            EpisodeDownload episodeDownload = this.x;
            if (episodeDownload != null && (metadata2 = episodeDownload.getMetadata()) != null && (subtitle = metadata2.getSubtitle()) != null) {
                subtitle2 = subtitle;
            } else {
                EpisodeDownload episodeDownload2 = this.y;
                if (episodeDownload2 != null && (metadata = episodeDownload2.getMetadata()) != null) {
                    subtitle2 = metadata.getSubtitle();
                }
            }
            if (this.A && subtitle2 != null) {
                String lang = subtitle2.getLang();
                String label = subtitle2.getLabel();
                if (label == null) {
                    label = "English";
                }
                return te4.H(new Track("offline_sub", "", lang, label, subtitle2.getDefault()));
            }
            return nt1Var;
        }
        SourcesResponse sourcesResponse = this.d;
        if (sourcesResponse != null) {
            list = sourcesResponse.getTracks();
        }
        if (list == null) {
            return nt1Var;
        }
        return list;
    }

    public final EpisodeDownload d() {
        Object next;
        EpisodeDownload episodeDownload = this.x;
        EpisodeDownload episodeDownload2 = this.y;
        ArrayList H0 = ms.H0(new EpisodeDownload[]{episodeDownload, episodeDownload2});
        ArrayList arrayList = new ArrayList();
        int size = H0.size();
        int i = 0;
        while (i < size) {
            Object obj = H0.get(i);
            i++;
            if (((EpisodeDownload) obj).isActive()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        EpisodeDownload episodeDownload3 = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                long createdAt = ((EpisodeDownload) next).getMetadata().getCreatedAt();
                do {
                    Object next2 = it.next();
                    long createdAt2 = ((EpisodeDownload) next2).getMetadata().getCreatedAt();
                    if (createdAt < createdAt2) {
                        next = next2;
                        createdAt = createdAt2;
                    }
                } while (it.hasNext());
            }
        }
        EpisodeDownload episodeDownload4 = (EpisodeDownload) next;
        if (episodeDownload4 == null) {
            if (episodeDownload != null && episodeDownload.isCompleted()) {
                episodeDownload3 = episodeDownload;
            }
            if (episodeDownload3 == null) {
                if (episodeDownload2 == null) {
                    return episodeDownload;
                }
                return episodeDownload2;
            }
            return episodeDownload3;
        }
        return episodeDownload4;
    }

    public final boolean e() {
        OfflineSubtitleMetadata offlineSubtitleMetadata;
        OfflineDownloadMetadata metadata;
        OfflineDownloadMetadata metadata2;
        List<Track> list = null;
        r3 = null;
        OfflineSubtitleMetadata offlineSubtitleMetadata2 = null;
        if (this.z) {
            if (this.A) {
                EpisodeDownload episodeDownload = this.x;
                if (episodeDownload != null && (metadata2 = episodeDownload.getMetadata()) != null) {
                    offlineSubtitleMetadata = metadata2.getSubtitle();
                } else {
                    offlineSubtitleMetadata = null;
                }
                if (offlineSubtitleMetadata == null) {
                    EpisodeDownload episodeDownload2 = this.y;
                    if (episodeDownload2 != null && (metadata = episodeDownload2.getMetadata()) != null) {
                        offlineSubtitleMetadata2 = metadata.getSubtitle();
                    }
                    if (offlineSubtitleMetadata2 != null) {
                    }
                }
                return true;
            }
            return false;
        }
        SourcesResponse sourcesResponse = this.d;
        if (sourcesResponse != null) {
            list = sourcesResponse.getTracks();
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym6)) {
            return false;
        }
        ym6 ym6Var = (ym6) obj;
        if (a34.i(this.a, ym6Var.a) && a34.i(this.b, ym6Var.b) && a34.i(this.c, ym6Var.c) && a34.i(this.d, ym6Var.d) && a34.i(this.e, ym6Var.e) && a34.i(this.f, ym6Var.f) && a34.i(this.g, ym6Var.g) && this.h == ym6Var.h && Float.compare(this.i, ym6Var.i) == 0 && this.j == ym6Var.j && a34.i(this.k, ym6Var.k) && a34.i(this.l, ym6Var.l) && a34.i(this.m, ym6Var.m) && a34.i(this.n, ym6Var.n) && a34.i(this.o, ym6Var.o) && this.p == ym6Var.p && this.q == ym6Var.q && this.r == ym6Var.r && a34.i(this.s, ym6Var.s) && a34.i(this.t, ym6Var.t) && a34.i(this.u, ym6Var.u) && a34.i(this.v, ym6Var.v) && a34.i(this.w, ym6Var.w) && a34.i(this.x, ym6Var.x) && a34.i(this.y, ym6Var.y) && this.z == ym6Var.z && this.A == ym6Var.A && this.B == ym6Var.B && a34.i(this.C, ym6Var.C) && this.D == ym6Var.D && this.E == ym6Var.E && this.F == ym6Var.F && this.G == ym6Var.G && this.H == ym6Var.H && this.I == ym6Var.I && this.J == ym6Var.J) {
            return true;
        }
        return false;
    }

    public final zw f() {
        Object obj;
        String str;
        if (this.z) {
            return (zw) yo0.m0(b());
        }
        if (g()) {
            return this.n;
        }
        Iterator it = b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((zw) obj).d;
                if (this.h) {
                    str = "dub";
                } else {
                    str = "sub";
                }
                if (a34.i(str2, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (zw) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r6 = this;
            r0 = 0
            boolean r1 = r6.h
            com.anistation.model.watch.Server r2 = r6.v
            if (r1 == 0) goto L10
            if (r2 == 0) goto Le
            java.util.List r1 = r2.getDub()
            goto L16
        Le:
            r1 = r0
            goto L16
        L10:
            if (r2 == 0) goto Le
            java.util.List r1 = r2.getSub()
        L16:
            r3 = 1
            java.lang.String r6 = r6.e
            if (r1 == 0) goto L3e
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.anistation.model.watch.Provider r5 = (com.anistation.model.watch.Provider) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = defpackage.b06.C(r5, r6, r3)
            if (r5 == 0) goto L1f
            goto L38
        L37:
            r4 = r0
        L38:
            com.anistation.model.watch.Provider r4 = (com.anistation.model.watch.Provider) r4
            if (r4 == 0) goto L3e
        L3c:
            r0 = r4
            goto L8f
        L3e:
            if (r2 == 0) goto L66
            java.util.List r1 = r2.getSub()
            if (r1 == 0) goto L66
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.anistation.model.watch.Provider r5 = (com.anistation.model.watch.Provider) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = defpackage.b06.C(r5, r6, r3)
            if (r5 == 0) goto L4a
            goto L63
        L62:
            r4 = r0
        L63:
            com.anistation.model.watch.Provider r4 = (com.anistation.model.watch.Provider) r4
            goto L67
        L66:
            r4 = r0
        L67:
            if (r4 != 0) goto L3c
            if (r2 == 0) goto L8f
            java.util.List r1 = r2.getDub()
            if (r1 == 0) goto L8f
            java.util.Iterator r1 = r1.iterator()
        L75:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.anistation.model.watch.Provider r4 = (com.anistation.model.watch.Provider) r4
            java.lang.String r4 = r4.getId()
            boolean r4 = defpackage.b06.C(r4, r6, r3)
            if (r4 == 0) goto L75
            r0 = r2
        L8d:
            com.anistation.model.watch.Provider r0 = (com.anistation.model.watch.Provider) r0
        L8f:
            r6 = 0
            if (r0 == 0) goto L99
            boolean r0 = r0.getMultiAudio()
            if (r0 != r3) goto L99
            return r3
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym6.g():boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        WatchSession watchSession = this.a;
        if (watchSession == null) {
            hashCode = 0;
        } else {
            hashCode = watchSession.hashCode();
        }
        int i2 = hashCode * 31;
        Episode episode = this.b;
        if (episode == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = episode.hashCode();
        }
        int j = zo5.j(this.c, (i2 + hashCode2) * 31, 31);
        SourcesResponse sourcesResponse = this.d;
        if (sourcesResponse == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = sourcesResponse.hashCode();
        }
        int g = zo5.g(qx1.b(this.i, zo5.g(zo5.i(this.g, zo5.i(this.f, zo5.i(this.e, (j + hashCode3) * 31, 31), 31), 31), 31, this.h), 31), 31, this.j);
        Track track = this.k;
        if (track == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = track.hashCode();
        }
        int j2 = zo5.j(this.m, zo5.i(this.l, (g + hashCode4) * 31, 31), 31);
        zw zwVar = this.n;
        if (zwVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = zwVar.hashCode();
        }
        int hashCode9 = (this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + zo5.g(zo5.g(zo5.g(zo5.i(this.o, (j2 + hashCode5) * 31, 31), 31, this.p), 31, this.q), 31, this.r)) * 31)) * 31)) * 31;
        Server server = this.v;
        if (server == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = server.hashCode();
        }
        int j3 = zo5.j(this.w, (hashCode9 + hashCode6) * 31, 31);
        EpisodeDownload episodeDownload = this.x;
        if (episodeDownload == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = episodeDownload.hashCode();
        }
        int i3 = (j3 + hashCode7) * 31;
        EpisodeDownload episodeDownload2 = this.y;
        if (episodeDownload2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = episodeDownload2.hashCode();
        }
        int g2 = zo5.g(zo5.g(zo5.g((i3 + hashCode8) * 31, 31, this.z), 31, this.A), 31, this.B);
        AnimeListItem animeListItem = this.C;
        if (animeListItem != null) {
            i = animeListItem.hashCode();
        }
        return Boolean.hashCode(this.J) + zo5.g(zo5.g(zo5.g(zo5.g(zo5.g(zo5.g((g2 + i) * 31, 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H), 31, this.I);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(session=");
        sb.append(this.a);
        sb.append(", currentEpisode=");
        sb.append(this.b);
        sb.append(", watchProgressList=");
        sb.append(this.c);
        sb.append(", sourcesResponse=");
        sb.append(this.d);
        sb.append(", selectedServer=");
        qx1.x(sb, this.e, ", selectedQuality=", this.f, ", selectedScale=");
        sb.append(this.g);
        sb.append(", dubEnabled=");
        sb.append(this.h);
        sb.append(", playbackSpeed=");
        sb.append(this.i);
        sb.append(", subtitlesEnabled=");
        sb.append(this.j);
        sb.append(", selectedSubtitleTrack=");
        sb.append(this.k);
        sb.append(", preferredSubtitleLanguage=");
        sb.append(this.l);
        sb.append(", embeddedAudioTracks=");
        sb.append(this.m);
        sb.append(", selectedEmbeddedAudioTrack=");
        sb.append(this.n);
        sb.append(", preferredAudioLanguage=");
        sb.append(this.o);
        sb.append(", autoPlay=");
        sb.append(this.p);
        sb.append(", autoSkip=");
        sb.append(this.q);
        sb.append(", autoNext=");
        sb.append(this.r);
        sb.append(", subtitleStyle=");
        sb.append(this.s);
        sb.append(", episodes=");
        sb.append(this.t);
        sb.append(", info=");
        sb.append(this.u);
        sb.append(", availableServers=");
        sb.append(this.v);
        sb.append(", availableQualities=");
        sb.append(this.w);
        sb.append(", activeDownload=");
        sb.append(this.x);
        sb.append(", activeExternalDownload=");
        sb.append(this.y);
        sb.append(", isOfflinePlayback=");
        sb.append(this.z);
        sb.append(", hasOfflineSubtitle=");
        sb.append(this.A);
        sb.append(", isDownloadPreparing=");
        sb.append(this.B);
        sb.append(", animeListItem=");
        sb.append(this.C);
        sb.append(", isSavedToList=");
        sb.append(this.D);
        sb.append(", isIntroSkipped=");
        sb.append(this.E);
        sb.append(", isOutroSkipped=");
        sb.append(this.F);
        sb.append(", isLoading=");
        sb.append(this.G);
        sb.append(", isServersLoading=");
        sb.append(this.H);
        sb.append(", isQualitiesLoading=");
        sb.append(this.I);
        sb.append(", isAudioTracksLoading=");
        sb.append(this.J);
        sb.append(")");
        return sb.toString();
    }
}

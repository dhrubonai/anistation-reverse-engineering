package defpackage;

import com.anistation.model.animelist.AnimeListImportProvider;
import com.anistation.model.backup.BackupFrequency;
import com.anistation.model.github.DevProfile;
import com.anistation.model.settings.HoldAction;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.settings.ThemeMode;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xm6 {
    public final boolean A;
    public final boolean B;
    public final boolean a;
    public final boolean b;
    public final ThemeMode c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final HoldAction g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final boolean o;
    public final Set p;
    public final AnimeListImportProvider q;
    public final SubtitleStyleSettings r;
    public final String s;
    public final BackupFrequency t;
    public final Long u;
    public final boolean v;
    public final String w;
    public final DevProfile x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ xm6(boolean r30, com.anistation.model.animelist.AnimeListImportProvider r31, com.anistation.model.backup.BackupFrequency r32, com.anistation.model.github.DevProfile r33, int r34) {
        /*
            r29 = this;
            r0 = r34
            com.anistation.model.settings.ThemeMode r3 = com.anistation.model.settings.ThemeMode.SYSTEM
            com.anistation.model.settings.HoldAction r7 = com.anistation.model.settings.HoldAction.FAST_FORWARD
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto Ld
            r1 = 0
            r10 = r1
            goto Lf
        Ld:
            r10 = r30
        Lf:
            sv1 r1 = com.anistation.model.animelist.WatchStatus.getEntries()
            java.util.Set r16 = defpackage.yo0.N0(r1)
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L21
            com.anistation.model.animelist.AnimeListImportProvider r1 = com.anistation.model.animelist.AnimeListImportProvider.ANILIST
            r17 = r1
            goto L23
        L21:
            r17 = r31
        L23:
            com.anistation.model.settings.SubtitleStyleSettings$Companion r1 = com.anistation.model.settings.SubtitleStyleSettings.Companion
            com.anistation.model.settings.SubtitleStyleSettings r18 = r1.getDEFAULT()
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L33
            com.anistation.model.backup.BackupFrequency r1 = com.anistation.model.backup.BackupFrequency.NEVER
            r20 = r1
            goto L35
        L33:
            r20 = r32
        L35:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L3e
            r23 = r2
            goto L42
        L3e:
            java.lang.String r1 = "Downloads/AniStation/Backups/AniStation-backup-20260822-184500.anistationbackup"
            r23 = r1
        L42:
            r1 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L4a
            r24 = r2
            goto L4c
        L4a:
            r24 = r33
        L4c:
            r27 = 0
            r28 = 0
            r1 = 1
            r2 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r8 = 1
            r9 = 1
            r11 = 0
            r12 = 0
            java.lang.String r13 = ""
            r15 = 0
            r19 = 0
            r21 = 0
            r22 = 1
            r25 = 0
            r26 = 0
            r14 = r13
            r0 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.<init>(boolean, com.anistation.model.animelist.AnimeListImportProvider, com.anistation.model.backup.BackupFrequency, com.anistation.model.github.DevProfile, int):void");
    }

    public static xm6 a(xm6 xm6Var, boolean z, boolean z2, ThemeMode themeMode, boolean z3, boolean z4, boolean z5, HoldAction holdAction, boolean z6, boolean z7, boolean z8, boolean z9, String str, String str2, boolean z10, Set set, AnimeListImportProvider animeListImportProvider, SubtitleStyleSettings subtitleStyleSettings, String str3, BackupFrequency backupFrequency, Long l, boolean z11, String str4, DevProfile devProfile, boolean z12, boolean z13, boolean z14, boolean z15, int i) {
        boolean z16 = (i & 1) != 0 ? xm6Var.a : z;
        boolean z17 = (i & 2) != 0 ? xm6Var.b : z2;
        ThemeMode themeMode2 = (i & 4) != 0 ? xm6Var.c : themeMode;
        boolean z18 = (i & 8) != 0 ? xm6Var.d : z3;
        boolean z19 = (i & 16) != 0 ? xm6Var.e : z4;
        boolean z20 = (i & 32) != 0 ? xm6Var.f : z5;
        HoldAction holdAction2 = (i & 64) != 0 ? xm6Var.g : holdAction;
        boolean z21 = (i & 128) != 0 ? xm6Var.h : z6;
        boolean z22 = (i & 256) != 0 ? xm6Var.i : z7;
        boolean z23 = xm6Var.j;
        boolean z24 = (i & 1024) != 0 ? xm6Var.k : z8;
        boolean z25 = (i & 2048) != 0 ? xm6Var.l : z9;
        String str5 = (i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? xm6Var.m : str;
        String str6 = (i & 8192) != 0 ? xm6Var.n : str2;
        boolean z26 = z16;
        boolean z27 = (i & 16384) != 0 ? xm6Var.o : z10;
        Set set2 = (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? xm6Var.p : set;
        AnimeListImportProvider animeListImportProvider2 = (i & 65536) != 0 ? xm6Var.q : animeListImportProvider;
        SubtitleStyleSettings subtitleStyleSettings2 = (i & 131072) != 0 ? xm6Var.r : subtitleStyleSettings;
        String str7 = (i & 262144) != 0 ? xm6Var.s : str3;
        BackupFrequency backupFrequency2 = (i & 524288) != 0 ? xm6Var.t : backupFrequency;
        Long l2 = (i & 1048576) != 0 ? xm6Var.u : l;
        boolean z28 = (i & 2097152) != 0 ? xm6Var.v : z11;
        String str8 = (i & 4194304) != 0 ? xm6Var.w : str4;
        DevProfile devProfile2 = (i & 8388608) != 0 ? xm6Var.x : devProfile;
        boolean z29 = (i & 16777216) != 0 ? xm6Var.y : z12;
        boolean z30 = (i & 33554432) != 0 ? xm6Var.z : z13;
        boolean z31 = (i & 67108864) != 0 ? xm6Var.A : z14;
        boolean z32 = (i & 134217728) != 0 ? xm6Var.B : z15;
        xm6Var.getClass();
        themeMode2.getClass();
        holdAction2.getClass();
        str5.getClass();
        str6.getClass();
        set2.getClass();
        animeListImportProvider2.getClass();
        subtitleStyleSettings2.getClass();
        backupFrequency2.getClass();
        return new xm6(z26, z17, themeMode2, z18, z19, z20, holdAction2, z21, z22, z23, z24, z25, str5, str6, z27, set2, animeListImportProvider2, subtitleStyleSettings2, str7, backupFrequency2, l2, z28, str8, devProfile2, z29, z30, z31, z32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm6)) {
            return false;
        }
        xm6 xm6Var = (xm6) obj;
        if (this.a == xm6Var.a && this.b == xm6Var.b && this.c == xm6Var.c && this.d == xm6Var.d && this.e == xm6Var.e && this.f == xm6Var.f && this.g == xm6Var.g && this.h == xm6Var.h && this.i == xm6Var.i && this.j == xm6Var.j && this.k == xm6Var.k && this.l == xm6Var.l && a34.i(this.m, xm6Var.m) && a34.i(this.n, xm6Var.n) && this.o == xm6Var.o && a34.i(this.p, xm6Var.p) && this.q == xm6Var.q && a34.i(this.r, xm6Var.r) && a34.i(this.s, xm6Var.s) && this.t == xm6Var.t && a34.i(this.u, xm6Var.u) && this.v == xm6Var.v && a34.i(this.w, xm6Var.w) && a34.i(this.x, xm6Var.x) && this.y == xm6Var.y && this.z == xm6Var.z && this.A == xm6Var.A && this.B == xm6Var.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + zo5.g(zo5.i(this.n, zo5.i(this.m, zo5.g(zo5.g(zo5.g(zo5.g(zo5.g((this.g.hashCode() + zo5.g(zo5.g(zo5.g((this.c.hashCode() + zo5.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31), 31, this.o)) * 31)) * 31)) * 31;
        int i = 0;
        String str = this.s;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.t.hashCode() + ((hashCode4 + hashCode) * 31)) * 31;
        Long l = this.u;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int g = zo5.g((hashCode5 + hashCode2) * 31, 31, this.v);
        String str2 = this.w;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (g + hashCode3) * 31;
        DevProfile devProfile = this.x;
        if (devProfile != null) {
            i = devProfile.hashCode();
        }
        return Boolean.hashCode(this.B) + zo5.g(zo5.g(zo5.g((i2 + i) * 31, 31, this.y), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(hapticsEnabled=");
        sb.append(this.a);
        sb.append(", adultEnabled=");
        sb.append(this.b);
        sb.append(", themeMode=");
        sb.append(this.c);
        sb.append(", volumeBrightnessGestureEnabled=");
        sb.append(this.d);
        sb.append(", fullscreenSwipeGesturesEnabled=");
        sb.append(this.e);
        sb.append(", holdFastForwardEnabled=");
        sb.append(this.f);
        sb.append(", holdAction=");
        sb.append(this.g);
        sb.append(", doubleTapToSkipEnabled=");
        sb.append(this.h);
        sb.append(", showSkipEnabled=");
        sb.append(this.i);
        sb.append(", discordRichPresenceAvailable=");
        sb.append(this.j);
        sb.append(", discordRichPresenceEnabled=");
        sb.append(this.k);
        sb.append(", discordShareWatchingDetailsEnabled=");
        sb.append(this.l);
        sb.append(", anilistUsername=");
        qx1.x(sb, this.m, ", malUsername=", this.n, ", eraseBeforeImport=");
        sb.append(this.o);
        sb.append(", selectedStatuses=");
        sb.append(this.p);
        sb.append(", importProvider=");
        sb.append(this.q);
        sb.append(", subtitleStyle=");
        sb.append(this.r);
        sb.append(", exportedFilePath=");
        sb.append(this.s);
        sb.append(", backupFrequency=");
        sb.append(this.t);
        sb.append(", lastSuccessfulBackupAt=");
        sb.append(this.u);
        sb.append(", includeAnimeList=");
        sb.append(this.v);
        sb.append(", backupFilePath=");
        sb.append(this.w);
        sb.append(", devProfile=");
        sb.append(this.x);
        sb.append(", isLoading=");
        sb.append(this.y);
        sb.append(", isBackupRunning=");
        sb.append(this.z);
        sb.append(", isRestoreRunning=");
        sb.append(this.A);
        sb.append(", isReporting=");
        sb.append(this.B);
        sb.append(")");
        return sb.toString();
    }

    public xm6(boolean z, boolean z2, ThemeMode themeMode, boolean z3, boolean z4, boolean z5, HoldAction holdAction, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, String str2, boolean z11, Set set, AnimeListImportProvider animeListImportProvider, SubtitleStyleSettings subtitleStyleSettings, String str3, BackupFrequency backupFrequency, Long l, boolean z12, String str4, DevProfile devProfile, boolean z13, boolean z14, boolean z15, boolean z16) {
        themeMode.getClass();
        holdAction.getClass();
        animeListImportProvider.getClass();
        subtitleStyleSettings.getClass();
        backupFrequency.getClass();
        this.a = z;
        this.b = z2;
        this.c = themeMode;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = holdAction;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = str;
        this.n = str2;
        this.o = z11;
        this.p = set;
        this.q = animeListImportProvider;
        this.r = subtitleStyleSettings;
        this.s = str3;
        this.t = backupFrequency;
        this.u = l;
        this.v = z12;
        this.w = str4;
        this.x = devProfile;
        this.y = z13;
        this.z = z14;
        this.A = z15;
        this.B = z16;
    }
}

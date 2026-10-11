package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class on implements cn {
    public final rm a;
    public final tm b;
    public final zx6 c;

    public on(rm rmVar, tm tmVar, zx6 zx6Var) {
        this.a = rmVar;
        this.b = tmVar;
        this.c = zx6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anistation.local.entity.AnimeListItem e(com.anistation.model.Info r20, java.lang.Integer r21, int r22, int r23, com.anistation.model.animelist.WatchStatus r24) {
        /*
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r20.getId()
            int r1 = r20.getAnilistId()
            java.lang.String r1 = defpackage.vc2.a(r1, r0)
            java.lang.String r2 = r20.getId()
            int r3 = r20.getAnilistId()
            java.lang.Integer r4 = r20.getMalId()
            com.anistation.model.Title r0 = r20.getTitle()
            java.lang.String r5 = defpackage.e02.b(r0)
            com.anistation.model.CoverImage r0 = r20.getCoverImage()
            java.lang.String r0 = r0.getExtraLarge()
            if (r0 != 0) goto L36
            com.anistation.model.CoverImage r0 = r20.getCoverImage()
            java.lang.String r0 = r0.getLarge()
        L36:
            r6 = r0
            java.lang.String r7 = r20.getBannerImage()
            if (r21 == 0) goto L4c
            int r0 = r21.intValue()
            if (r0 <= 0) goto L46
            r0 = r21
            goto L47
        L46:
            r0 = 0
        L47:
            if (r0 != 0) goto L4a
            goto L4c
        L4a:
            r8 = r0
            goto L51
        L4c:
            java.lang.Integer r0 = r20.getTotalEpisodes()
            goto L4a
        L51:
            com.anistation.model.MediaStatus r10 = r20.getStatus()
            if (r24 != 0) goto L60
            if (r23 <= 0) goto L5d
            com.anistation.model.animelist.WatchStatus r0 = com.anistation.model.animelist.WatchStatus.WATCHING
        L5b:
            r11 = r0
            goto L62
        L5d:
            com.anistation.model.animelist.WatchStatus r0 = com.anistation.model.animelist.WatchStatus.PLAN_TO_WATCH
            goto L5b
        L60:
            r11 = r24
        L62:
            com.anistation.model.MediaFormat r14 = r20.getFormat()
            com.anistation.local.entity.AnimeListItem r0 = new com.anistation.local.entity.AnimeListItem
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = r16
            r9 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on.e(com.anistation.model.Info, java.lang.Integer, int, int, com.anistation.model.animelist.WatchStatus):com.anistation.local.entity.AnimeListItem");
    }

    public final w42 a(String str, List list) {
        mx0 mx0Var = new mx0(new dn(null, this, str, list), (byte) 5);
        ja1 ja1Var = rh1.a;
        return zz.D(mx0Var, j91.y);
    }

    public final w42 b(String str, List list) {
        mx0 mx0Var = new mx0(new en(null, this, str, list), (byte) 5);
        ja1 ja1Var = rh1.a;
        return zz.D(mx0Var, j91.y);
    }

    public final Object c(String str, int i, xz0 xz0Var) {
        Object promoteLegacyIdentity = this.b.promoteLegacyIdentity(vc2.a(i, str), i, xz0Var);
        if (promoteLegacyIdentity == w11.x) {
            return promoteLegacyIdentity;
        }
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0196, code lost:
    
        if (r0.clearAll(r2) == r9) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00a4, code lost:
    
        if (r10 == r9) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03ba, code lost:
    
        if (r5.upsertAllProgress(r4, r3) == r9) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02b5, code lost:
    
        if (r1 == r9) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e1, code lost:
    
        if (r0.promoteLegacyIdentity(r10, r1, r2) == r9) goto L128;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007c  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0203 -> B:49:0x0205). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r36, boolean r37, defpackage.xz0 r38) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on.d(java.util.List, boolean, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        if (r5.deleteByAnimeId(r8, r2) == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r5.upsert(r1, r2) == r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.anistation.model.Info r17, java.lang.Integer r18, int r19, int r20, defpackage.xz0 r21) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on.f(com.anistation.model.Info, java.lang.Integer, int, int, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r6.b.upsert(r7, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (c(r12, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.anistation.model.Info r7, java.lang.Integer r8, int r9, int r10, com.anistation.model.animelist.WatchStatus r11, defpackage.xz0 r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.nn
            if (r0 == 0) goto L13
            r0 = r12
            nn r0 = (defpackage.nn) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.E = r1
            goto L18
        L13:
            nn r0 = new nn
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.C
            int r1 = r0.E
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r12)
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L31:
            int r10 = r0.B
            int r9 = r0.A
            com.anistation.model.animelist.WatchStatus r11 = r0.z
            java.lang.Integer r8 = r0.y
            com.anistation.model.Info r7 = r0.x
            defpackage.m37.N(r12)
            goto L5d
        L3f:
            defpackage.m37.N(r12)
            java.lang.String r12 = r7.getId()
            int r1 = r7.getAnilistId()
            r0.x = r7
            r0.y = r8
            r0.z = r11
            r0.A = r9
            r0.B = r10
            r0.E = r3
            java.lang.Object r12 = r6.c(r12, r1, r0)
            if (r12 != r5) goto L5d
            goto L75
        L5d:
            com.anistation.local.entity.AnimeListItem r7 = e(r7, r8, r9, r10, r11)
            r0.x = r4
            r0.y = r4
            r0.z = r4
            r0.A = r9
            r0.B = r10
            r0.E = r2
            tm r6 = r6.b
            java.lang.Object r6 = r6.upsert(r7, r0)
            if (r6 != r5) goto L76
        L75:
            return r5
        L76:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on.g(com.anistation.model.Info, java.lang.Integer, int, int, com.anistation.model.animelist.WatchStatus, xz0):java.lang.Object");
    }
}

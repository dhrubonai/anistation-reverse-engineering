package defpackage;

import com.anistation.local.entity.AnimeListItem;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface tm {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r3 == r12) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(com.anistation.local.dao.AnimeListDao_Impl r36, java.lang.String r37, int r38, defpackage.vz0 r39) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.a(com.anistation.local.dao.AnimeListDao_Impl, java.lang.String, int, vz0):java.lang.Object");
    }

    Object clearAll(vz0 vz0Var);

    Object deleteByAnimeId(String str, vz0 vz0Var);

    Object getAllOnce(vz0 vz0Var);

    Object getByAnimeId(String str, vz0 vz0Var);

    Object getLegacyByAnilistId(int i, vz0 vz0Var);

    w42 observeAllWithProgress();

    w42 observeByIdentity(String str, int i);

    w42 observeIsSaved(String str, int i);

    Object promoteLegacyIdentity(String str, int i, vz0 vz0Var);

    Object upsert(AnimeListItem animeListItem, vz0 vz0Var);

    Object upsertAll(List list, vz0 vz0Var);
}

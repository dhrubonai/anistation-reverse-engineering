package defpackage;

import com.anistation.local.entity.WatchProgress;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface zx6 {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (r3 == r8) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014c -> B:26:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0189 -> B:25:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(com.anistation.local.dao.WatchProgressDao_Impl r31, java.lang.String r32, int r33, defpackage.vz0 r34) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx6.a(com.anistation.local.dao.WatchProgressDao_Impl, java.lang.String, int, vz0):java.lang.Object");
    }

    Object clearAll(vz0 vz0Var);

    Object clearRemovedWatchHistory(vz0 vz0Var);

    Object deleteById(String str, vz0 vz0Var);

    w42 getAllLastWatchedProgress();

    Object getAllOnce(vz0 vz0Var);

    Object getAllRemovedOnce(vz0 vz0Var);

    w42 getAllWatchedProgress(String str, int i);

    Object getById(String str, vz0 vz0Var);

    w42 getLastWatchedProgress(String str, int i);

    Object getLegacyProgress(int i, vz0 vz0Var);

    Object getProgress(String str, int i, int i2, vz0 vz0Var);

    Object getProgressSummaries(vz0 vz0Var);

    Object hideFromWatchHistory(List list, vz0 vz0Var);

    Object isHidden(String str, vz0 vz0Var);

    Object promoteLegacyIdentity(String str, int i, vz0 vz0Var);

    Object unhideFromWatchHistory(String str, vz0 vz0Var);

    Object upsertAllProgress(List list, vz0 vz0Var);

    Object upsertProgress(WatchProgress watchProgress, vz0 vz0Var);
}

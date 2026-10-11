package com.unity3d.services.core.network.domain;

import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.c32;
import defpackage.d32;
import defpackage.io3;
import defpackage.nt1;
import defpackage.os;
import defpackage.ri5;
import defpackage.u22;
import defpackage.v22;
import defpackage.vs0;
import defpackage.yn1;
import defpackage.yo0;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CleanupDirectory {
    private final Logger logger;

    public CleanupDirectory(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public static final ai4 invoke$lambda$3(ai4 ai4Var, File file) {
        ai4Var.getClass();
        file.getClass();
        return new ai4(Long.valueOf(((Number) ai4Var.x).longValue() - file.length()), yo0.v0((List) ai4Var.y, file));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    public final void invoke(File file, int i, long j) {
        ?? r11;
        file.getClass();
        if (file.exists() && file.isDirectory()) {
            u22 u22Var = new u22(file, v22.x);
            CleanupDirectory$invoke$cachedFiles$1 cleanupDirectory$invoke$cachedFiles$1 = CleanupDirectory$invoke$cachedFiles$1.INSTANCE;
            cleanupDirectory$invoke$cachedFiles$1.getClass();
            d32 d32Var = new d32(u22Var, true, cleanupDirectory$invoke$cachedFiles$1);
            c32 c32Var = new c32(d32Var);
            long j2 = 0;
            long j3 = 0;
            while (c32Var.hasNext()) {
                j3 += ((File) c32Var.next()).length();
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c32 c32Var2 = new c32(d32Var);
            while (c32Var2.hasNext()) {
                Object next = c32Var2.next();
                if (((File) next).lastModified() + j < currentTimeMillis) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                j2 += ((File) obj).length();
            }
            long j4 = j3 - j2;
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((File) obj2).delete();
            }
            long j5 = i * 1048576;
            if (j4 > j5) {
                Object obj3 = null;
                ri5 V = io3.V(new yn1(new ai4(Long.valueOf(j4), nt1.x), new u22(new os(arrayList2, (byte) 1), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return Long.valueOf(((File) t).lastModified()).compareTo(Long.valueOf(((File) t2).lastModified()));
                    }
                }, (byte) 3), new vs0((byte) 23), null));
                while (true) {
                    if (!V.hasNext()) {
                        break;
                    }
                    Object next2 = V.next();
                    if (((Number) ((ai4) next2).x).longValue() <= j5) {
                        obj3 = next2;
                        break;
                    }
                }
                ai4 ai4Var = (ai4) obj3;
                if (ai4Var != null && (r11 = (List) ai4Var.y) != 0) {
                    arrayList2 = r11;
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                return;
            }
            return;
        }
        this.logger.debug("Directory does not exist or is not a directory: " + file + ", nothing to clean up.");
    }
}

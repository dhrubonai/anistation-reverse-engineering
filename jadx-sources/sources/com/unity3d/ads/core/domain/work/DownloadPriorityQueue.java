package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.k54;
import defpackage.m54;
import defpackage.tx5;
import defpackage.x44;
import java.util.Comparator;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadPriorityQueue {
    private final k54 mutex;
    private final x44 nextTurn;
    private final PriorityQueue<PriorityItem> queue;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadPriorityQueue(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
        this.mutex = new m54();
        this.nextTurn = tx5.a(null);
        this.queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()).compareTo(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:23|24))(7:25|26|27|28|29|(1:31)|32))(2:36|37))(1:39))(3:49|(1:51)|34)|40|41|42|(2:44|37)|34))|56|6|7|(0)(0)|40|41|42|(0)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r10.a(r0) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r11.invoke(r0) != r8) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        r12 = new defpackage.y45(r11);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(int r10, defpackage.ub2 r11, defpackage.vz0 r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, ub2, vz0):java.lang.Object");
    }
}

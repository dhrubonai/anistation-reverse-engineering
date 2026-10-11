package com.unity3d.services.core.extensions;

import defpackage.db;
import defpackage.k54;
import defpackage.m54;
import defpackage.nc1;
import defpackage.ub2;
import defpackage.vz0;
import defpackage.y45;
import defpackage.z45;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, nc1> deferreds = new LinkedHashMap<Object, nc1>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof nc1)) {
                return false;
            }
            return containsValue((nc1) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, nc1>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, nc1>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<nc1> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj == null || !(obj2 instanceof nc1)) {
                return false;
            }
            return remove(obj, (nc1) obj2);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, nc1> entry) {
            entry.getClass();
            if (size() > 100) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<nc1> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(nc1 nc1Var) {
            return super.containsValue((Object) nc1Var);
        }

        public /* bridge */ boolean remove(Object obj, nc1 nc1Var) {
            return super.remove(obj, (Object) nc1Var);
        }
    };
    private static final k54 mutex = new m54();

    public static final LinkedHashMap<Object, nc1> getDeferreds() {
        return deferreds;
    }

    public static final k54 getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, ub2 ub2Var, vz0 vz0Var) {
        return db.K(new CoroutineExtensionsKt$memoize$2(obj, ub2Var, null), vz0Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(4:24|25|26|(1:28))|11|12|(1:14)(2:16|(2:18|19)(1:20))))|33|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        r5 = new defpackage.y45(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object runReturnSuspendCatching(defpackage.ub2 r4, defpackage.vz0 r5) {
        /*
            boolean r0 = r5 instanceof com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1 r0 = (com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1 r0 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$runReturnSuspendCatching$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L51
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            r0.label = r2     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L51
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L51
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L40
            return r4
        L3a:
            r4 = move-exception
            y45 r5 = new y45
            r5.<init>(r4)
        L40:
            boolean r4 = r5 instanceof defpackage.y45
            if (r4 != 0) goto L45
            return r5
        L45:
            java.lang.Throwable r4 = defpackage.z45.b(r5)
            if (r4 == 0) goto L50
            y45 r5 = new y45
            r5.<init>(r4)
        L50:
            return r5
        L51:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.CoroutineExtensionsKt.runReturnSuspendCatching(ub2, vz0):java.lang.Object");
    }

    private static final <R> Object runReturnSuspendCatching$$forInline(ub2 ub2Var, vz0 vz0Var) {
        Object y45Var;
        try {
            y45Var = ub2Var.invoke(vz0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            return y45Var;
        }
        Throwable b = z45.b(y45Var);
        if (b != null) {
            return new y45(b);
        }
        return y45Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object runSuspendCatching(defpackage.ub2 r4, defpackage.vz0 r5) {
        /*
            boolean r0 = r5 instanceof com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1 r0 = (com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1 r0 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$runSuspendCatching$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L42
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            r0.label = r2     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L42
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L42
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3a
            return r4
        L3a:
            return r5
        L3b:
            r4 = move-exception
            y45 r5 = new y45
            r5.<init>(r4)
            return r5
        L42:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.CoroutineExtensionsKt.runSuspendCatching(ub2, vz0):java.lang.Object");
    }

    private static final <R> Object runSuspendCatching$$forInline(ub2 ub2Var, vz0 vz0Var) {
        try {
            return ub2Var.invoke(vz0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new y45(th);
        }
    }
}

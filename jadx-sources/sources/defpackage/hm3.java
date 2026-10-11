package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class hm3 {
    public final byte a;
    public final rl0 b;
    public final r18 c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public hm3(int i) {
        this.a = i;
        if (i > 0) {
            this.b = new rl0((byte) 1);
            this.c = new r18((byte) 23);
        } else {
            ze0.k("maxSize <= 0");
            throw null;
        }
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object c(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    put = this.b.a.put(obj, a);
                    if (put != null) {
                        this.b.a.put(obj, put);
                    } else {
                        this.d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(obj, a, put);
                return put;
            }
            f(this.a);
            return a;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            put = this.b.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        f(this.a);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.c) {
            remove = this.b.a.remove(obj);
            if (remove != null) {
                this.d--;
            }
        }
        if (remove != null) {
            b(obj, remove, null);
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r5) {
        /*
            r4 = this;
        L0:
            r18 r0 = r4.c
            monitor-enter(r0)
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L61
            rl0 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L61
            goto L18
        L16:
            r4 = move-exception
            goto L69
        L18:
            int r1 = r4.d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r5) goto L5f
            rl0 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L5f
        L27:
            rl0 r1 = r4.b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = defpackage.yo0.l0(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L3e
            monitor-exit(r0)
            return
        L3e:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            rl0 r3 = r4.b     // Catch: java.lang.Throwable -> L16
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.d     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + (-1)
            r4.d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r4.b(r2, r1, r0)
            goto L0
        L5f:
            monitor-exit(r0)
            return
        L61:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L16
            throw r5     // Catch: java.lang.Throwable -> L16
        L69:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm3.f(int):void");
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.c) {
            try {
                int i2 = this.e;
                int i3 = this.f + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                } else {
                    i = 0;
                }
                str = "LruCache[maxSize=" + ((int) this.a) + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + i + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ig5 {
    public static final yf5 a = new yf5(new byte[0], 0, 0, null);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        String str;
        int intValue;
        int i = 0;
        int i2 = 1;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        int i3 = highestOneBit / 2;
        if (i3 >= 1) {
            i2 = i3;
        }
        c = i2;
        if (a34.i(System.getProperty("java.vm.name"), "Dalvik")) {
            str = "0";
        } else {
            str = "4194304";
        }
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        property.getClass();
        Integer J = b06.J(10, property);
        if (J != null && (intValue = J.intValue()) >= 0) {
            i = intValue;
        }
        d = i;
        int i4 = i / i2;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(highestOneBit);
        g = new AtomicReferenceArray(i2);
    }

    public static final void a(yf5 yf5Var) {
        int i;
        int i2;
        yf5 yf5Var2 = a;
        yf5Var.getClass();
        if (yf5Var.f == null && yf5Var.g == null) {
            x05 x05Var = yf5Var.d;
            if (x05Var != null && x05Var.a != 0) {
                int decrementAndGet = x05.b.decrementAndGet(x05Var);
                if (decrementAndGet < 0) {
                    if (decrementAndGet == -1) {
                        x05Var.a = 0;
                    } else {
                        p65.e(decrementAndGet + 1, "Shared copies count is negative: ");
                        return;
                    }
                } else {
                    return;
                }
            }
            AtomicReferenceArray atomicReferenceArray = f;
            int id = (int) ((b - 1) & Thread.currentThread().getId());
            yf5Var.b = 0;
            yf5Var.e = true;
            while (true) {
                yf5 yf5Var3 = (yf5) atomicReferenceArray.get(id);
                if (yf5Var3 != yf5Var2) {
                    if (yf5Var3 != null) {
                        i = yf5Var3.c;
                    } else {
                        i = 0;
                    }
                    if (i >= 65536) {
                        if (d > 0) {
                            yf5Var.b = 0;
                            yf5Var.e = true;
                            int id2 = (int) ((c - 1) & Thread.currentThread().getId());
                            AtomicReferenceArray atomicReferenceArray2 = g;
                            int i3 = 0;
                            while (true) {
                                yf5 yf5Var4 = (yf5) atomicReferenceArray2.get(id2);
                                if (yf5Var4 != yf5Var2) {
                                    if (yf5Var4 != null) {
                                        i2 = yf5Var4.c;
                                    } else {
                                        i2 = 0;
                                    }
                                    int i4 = i2 + 8192;
                                    if (i4 > e) {
                                        int i5 = c;
                                        if (i3 < i5) {
                                            i3++;
                                            id2 = (id2 + 1) & (i5 - 1);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        yf5Var.f = yf5Var4;
                                        yf5Var.c = i4;
                                        while (!atomicReferenceArray2.compareAndSet(id2, yf5Var4, yf5Var)) {
                                            if (atomicReferenceArray2.get(id2) != yf5Var4) {
                                                break;
                                            }
                                        }
                                        return;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        yf5Var.f = yf5Var3;
                        yf5Var.c = i + 8192;
                        while (!atomicReferenceArray.compareAndSet(id, yf5Var3, yf5Var)) {
                            if (atomicReferenceArray.get(id) != yf5Var3) {
                                break;
                            }
                        }
                        return;
                    }
                }
            }
        } else {
            ze0.k("Failed requirement.");
        }
    }

    public static final yf5 b() {
        AtomicReferenceArray atomicReferenceArray;
        yf5 yf5Var;
        yf5 yf5Var2;
        int id = (int) ((b - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            yf5Var = a;
            yf5Var2 = (yf5) atomicReferenceArray.getAndSet(id, yf5Var);
        } while (a34.i(yf5Var2, yf5Var));
        if (yf5Var2 == null) {
            atomicReferenceArray.set(id, null);
            if (d > 0) {
                int i = c;
                int id2 = (int) (Thread.currentThread().getId() & (i - 1));
                int i2 = 0;
                while (true) {
                    AtomicReferenceArray atomicReferenceArray2 = g;
                    yf5 yf5Var3 = (yf5) atomicReferenceArray2.getAndSet(id2, yf5Var);
                    if (!a34.i(yf5Var3, yf5Var)) {
                        if (yf5Var3 == null) {
                            atomicReferenceArray2.set(id2, null);
                            if (i2 < i) {
                                id2 = (id2 + 1) & (i - 1);
                                i2++;
                            } else {
                                return new yf5();
                            }
                        } else {
                            atomicReferenceArray2.set(id2, yf5Var3.f);
                            yf5Var3.f = null;
                            yf5Var3.c = 0;
                            return yf5Var3;
                        }
                    }
                }
            } else {
                return new yf5();
            }
        } else {
            atomicReferenceArray.set(id, yf5Var2.f);
            yf5Var2.f = null;
            yf5Var2.c = 0;
            return yf5Var2;
        }
    }
}

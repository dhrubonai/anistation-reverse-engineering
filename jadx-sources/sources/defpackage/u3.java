package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u3 extends t3 {
    public static u3 e;
    public static u3 f;
    public static u3 g;
    public static final c45 h = c45.y;
    public static final c45 i = c45.x;
    public final /* synthetic */ byte c;
    public Object d;

    @Override // defpackage.t3
    public final int[] a(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.following(i2);
                            } else {
                                a34.s0("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int following = breakIterator2.following(i2);
                                if (following == -1) {
                                    return null;
                                }
                                return b(i2, following);
                            }
                            a34.s0("impl");
                            throw null;
                        }
                    } else {
                        a34.s0("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.following(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        a34.s0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i2);
                    if (following2 == -1 || !g(following2)) {
                        return null;
                    }
                    return b(i2, following2);
                }
                a34.s0("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                bd6 bd6Var = (bd6) this.d;
                c45 c45Var = h;
                if (i2 < 0) {
                    if (bd6Var != null) {
                        i3 = bd6Var.b.d(0);
                    } else {
                        a34.s0("layoutResult");
                        throw null;
                    }
                } else if (bd6Var != null) {
                    int d = bd6Var.b.d(i2);
                    if (e(d, c45Var) == i2) {
                        i3 = d;
                    } else {
                        i3 = d + 1;
                    }
                } else {
                    a34.s0("layoutResult");
                    throw null;
                }
                bd6 bd6Var2 = (bd6) this.d;
                if (bd6Var2 != null) {
                    if (i3 >= bd6Var2.b.f) {
                        return null;
                    }
                    return b(e(i3, c45Var), e(i3, i) + 1);
                }
                a34.s0("layoutResult");
                throw null;
        }
    }

    @Override // defpackage.t3
    public final int[] d(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.preceding(i2);
                            } else {
                                a34.s0("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int preceding = breakIterator2.preceding(i2);
                                if (preceding == -1) {
                                    return null;
                                }
                                return b(preceding, i2);
                            }
                            a34.s0("impl");
                            throw null;
                        }
                    } else {
                        a34.s0("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.preceding(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        a34.s0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i2);
                    if (preceding2 == -1 || !h(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && h(preceding2 - 1)) {
                        return null;
                    }
                    return b(preceding2, i2);
                }
                a34.s0("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                bd6 bd6Var = (bd6) this.d;
                c45 c45Var = i;
                if (i2 > length3) {
                    if (bd6Var != null) {
                        i3 = bd6Var.b.d(c().length());
                    } else {
                        a34.s0("layoutResult");
                        throw null;
                    }
                } else if (bd6Var != null) {
                    int d = bd6Var.b.d(i2);
                    if (e(d, c45Var) + 1 == i2) {
                        i3 = d;
                    } else {
                        i3 = d - 1;
                    }
                } else {
                    a34.s0("layoutResult");
                    throw null;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(e(i3, h), e(i3, c45Var) + 1);
        }
    }

    public int e(int i2, c45 c45Var) {
        bd6 bd6Var = (bd6) this.d;
        if (bd6Var != null) {
            int h2 = bd6Var.h(i2);
            bd6 bd6Var2 = (bd6) this.d;
            if (bd6Var2 != null) {
                c45 i3 = bd6Var2.i(h2);
                bd6 bd6Var3 = (bd6) this.d;
                if (c45Var != i3) {
                    if (bd6Var3 != null) {
                        return bd6Var3.h(i2);
                    }
                    a34.s0("layoutResult");
                    throw null;
                }
                if (bd6Var3 != null) {
                    return bd6Var3.b.c(i2, false) - 1;
                }
                a34.s0("layoutResult");
                throw null;
            }
            a34.s0("layoutResult");
            throw null;
        }
        a34.s0("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    a34.s0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    a34.s0("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 > 0 && h(i2 - 1)) {
            if (i2 == c().length() || !h(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean h(int i2) {
        if (i2 >= 0 && i2 < c().length()) {
            return Character.isLetterOrDigit(c().codePointAt(i2));
        }
        return false;
    }
}

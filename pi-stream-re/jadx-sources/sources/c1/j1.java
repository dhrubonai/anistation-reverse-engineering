package c1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j1 {
    public HashMap A;
    public HashSet B;

    /* renamed from: a, reason: collision with root package name */
    public int f1735a;

    /* renamed from: b, reason: collision with root package name */
    public int f1736b;

    /* renamed from: c, reason: collision with root package name */
    public int f1737c;

    /* renamed from: d, reason: collision with root package name */
    public int f1738d;

    /* renamed from: e, reason: collision with root package name */
    public int f1739e;

    /* renamed from: f, reason: collision with root package name */
    public int f1740f;

    /* renamed from: g, reason: collision with root package name */
    public int f1741g;

    /* renamed from: h, reason: collision with root package name */
    public int f1742h;

    /* renamed from: i, reason: collision with root package name */
    public int f1743i;

    /* renamed from: j, reason: collision with root package name */
    public int f1744j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1745k;

    /* renamed from: l, reason: collision with root package name */
    public r6.o0 f1746l;

    /* renamed from: m, reason: collision with root package name */
    public int f1747m;

    /* renamed from: n, reason: collision with root package name */
    public r6.o0 f1748n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f1749p;

    /* renamed from: q, reason: collision with root package name */
    public int f1750q;

    /* renamed from: r, reason: collision with root package name */
    public r6.o0 f1751r;

    /* renamed from: s, reason: collision with root package name */
    public i1 f1752s;

    /* renamed from: t, reason: collision with root package name */
    public r6.o0 f1753t;

    /* renamed from: u, reason: collision with root package name */
    public int f1754u;

    /* renamed from: v, reason: collision with root package name */
    public int f1755v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1756w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1757x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1758y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1759z;

    public j1() {
        this.f1735a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1736b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1737c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1738d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1743i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1744j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1745k = true;
        r6.m0 m0Var = r6.o0.f9505b;
        r6.n1 n1Var = r6.n1.f9497e;
        this.f1746l = n1Var;
        this.f1747m = 0;
        this.f1748n = n1Var;
        this.o = 0;
        this.f1749p = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1750q = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f1751r = n1Var;
        this.f1752s = i1.f1719d;
        this.f1753t = n1Var;
        this.f1754u = 0;
        this.f1755v = 0;
        this.f1756w = false;
        this.f1757x = false;
        this.f1758y = false;
        this.f1759z = false;
        this.A = new HashMap();
        this.B = new HashSet();
    }

    public void a(int i10) {
        Iterator it = this.A.values().iterator();
        while (it.hasNext()) {
            if (((g1) it.next()).f1706a.f1692c == i10) {
                it.remove();
            }
        }
    }

    public final void b(k1 k1Var) {
        this.f1735a = k1Var.f1774a;
        this.f1736b = k1Var.f1775b;
        this.f1737c = k1Var.f1776c;
        this.f1738d = k1Var.f1777d;
        this.f1739e = k1Var.f1778e;
        this.f1740f = k1Var.f1779f;
        this.f1741g = k1Var.f1780g;
        this.f1742h = k1Var.f1781h;
        this.f1743i = k1Var.f1782i;
        this.f1744j = k1Var.f1783j;
        this.f1745k = k1Var.f1784k;
        this.f1746l = k1Var.f1785l;
        this.f1747m = k1Var.f1786m;
        this.f1748n = k1Var.f1787n;
        this.o = k1Var.o;
        this.f1749p = k1Var.f1788p;
        this.f1750q = k1Var.f1789q;
        this.f1751r = k1Var.f1790r;
        this.f1752s = k1Var.f1791s;
        this.f1753t = k1Var.f1792t;
        this.f1754u = k1Var.f1793u;
        this.f1755v = k1Var.f1794v;
        this.f1756w = k1Var.f1795w;
        this.f1757x = k1Var.f1796x;
        this.f1758y = k1Var.f1797y;
        this.f1759z = k1Var.f1798z;
        this.B = new HashSet(k1Var.B);
        this.A = new HashMap(k1Var.A);
    }

    public j1 c(int i10, int i11) {
        this.f1743i = i10;
        this.f1744j = i11;
        this.f1745k = true;
        return this;
    }

    public j1(k1 k1Var) {
        b(k1Var);
    }
}

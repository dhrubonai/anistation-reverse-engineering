package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f812a;

    /* renamed from: b, reason: collision with root package name */
    public int f813b;

    /* renamed from: c, reason: collision with root package name */
    public int f814c;

    /* renamed from: d, reason: collision with root package name */
    public int f815d;

    /* renamed from: e, reason: collision with root package name */
    public int f816e;

    /* renamed from: f, reason: collision with root package name */
    public int f817f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f818g;

    /* renamed from: h, reason: collision with root package name */
    public String f819h;

    /* renamed from: i, reason: collision with root package name */
    public int f820i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f821j;

    /* renamed from: k, reason: collision with root package name */
    public int f822k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f823l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f824m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f825n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final s0 f826p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f827q;

    /* renamed from: r, reason: collision with root package name */
    public int f828r;

    public a(s0 s0Var) {
        s0Var.E();
        a0 a0Var = s0Var.f986t;
        if (a0Var != null) {
            a0Var.D.getClassLoader();
        }
        this.f812a = new ArrayList();
        this.o = false;
        this.f828r = -1;
        this.f826p = s0Var;
    }

    @Override // androidx.fragment.app.q0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (s0.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f818g) {
            s0 s0Var = this.f826p;
            if (s0Var.f971d == null) {
                s0Var.f971d = new ArrayList();
            }
            s0Var.f971d.add(this);
            return true;
        }
        return true;
    }

    public final void b(a1 a1Var) {
        this.f812a.add(a1Var);
        a1Var.f832d = this.f813b;
        a1Var.f833e = this.f814c;
        a1Var.f834f = this.f815d;
        a1Var.f835g = this.f816e;
    }

    public final void c(int i10) {
        if (!this.f818g) {
            return;
        }
        if (s0.H(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        ArrayList arrayList = this.f812a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a1 a1Var = (a1) arrayList.get(i11);
            y yVar = a1Var.f830b;
            if (yVar != null) {
                yVar.H += i10;
                if (s0.H(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + a1Var.f830b + " to " + a1Var.f830b.H);
                }
            }
        }
    }

    public final int d(boolean z9) {
        if (!this.f827q) {
            if (s0.H(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new k1());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.f827q = true;
            boolean z10 = this.f818g;
            s0 s0Var = this.f826p;
            if (z10) {
                this.f828r = s0Var.f976i.getAndIncrement();
            } else {
                this.f828r = -1;
            }
            s0Var.v(this, z9);
            return this.f828r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e() {
        if (!this.f818g) {
            this.f826p.y(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void f() {
        if (!this.f818g) {
            this.f826p.y(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void g(int i10, y yVar, String str, int i11) {
        String str2 = yVar.f1032b0;
        if (str2 != null) {
            v0.c.d(yVar, str2);
        }
        Class<?> cls = yVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = yVar.O;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + yVar + ": was " + yVar.O + " now " + str);
                }
                yVar.O = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = yVar.M;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + yVar + ": was " + yVar.M + " now " + i10);
                    }
                    yVar.M = i10;
                    yVar.N = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + yVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new a1(i11, yVar));
            yVar.I = this.f826p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void h(String str, PrintWriter printWriter, boolean z9) {
        String str2;
        if (z9) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f819h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f828r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f827q);
            if (this.f817f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f817f));
            }
            if (this.f813b != 0 || this.f814c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f813b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f814c));
            }
            if (this.f815d != 0 || this.f816e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f815d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f816e));
            }
            if (this.f820i != 0 || this.f821j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f820i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f821j);
            }
            if (this.f822k != 0 || this.f823l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f822k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f823l);
            }
        }
        ArrayList arrayList = this.f812a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a1 a1Var = (a1) arrayList.get(i10);
                switch (a1Var.f829a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case zzaja.zze.zzg /* 7 */:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + a1Var.f829a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(a1Var.f830b);
                if (z9) {
                    if (a1Var.f832d != 0 || a1Var.f833e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a1Var.f832d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a1Var.f833e));
                    }
                    if (a1Var.f834f != 0 || a1Var.f835g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a1Var.f834f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a1Var.f835g));
                    }
                }
            }
        }
    }

    public final void i(y yVar) {
        s0 s0Var = yVar.I;
        if (s0Var != null && s0Var != this.f826p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + yVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new a1(3, yVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f828r >= 0) {
            sb.append(" #");
            sb.append(this.f828r);
        }
        if (this.f819h != null) {
            sb.append(" ");
            sb.append(this.f819h);
        }
        sb.append("}");
        return sb.toString();
    }
}

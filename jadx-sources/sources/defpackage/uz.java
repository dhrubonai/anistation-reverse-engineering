package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uz {
    public final ArrayList a;
    public ArrayList b;
    public final ra2 c;
    public boolean d;
    public int e;

    public uz(ra2 ra2Var) {
        ra2Var.getClass();
        this.a = new ArrayList();
        this.e = -1;
        this.c = ra2Var;
    }

    public final int a(boolean z) {
        String str;
        ra2 ra2Var = this.c;
        if (!this.d) {
            if (ra2.l(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new vk3());
                ArrayList arrayList = this.a;
                printWriter.print("  ");
                printWriter.print("mName=");
                printWriter.print((String) null);
                printWriter.print(" mIndex=");
                printWriter.print(this.e);
                printWriter.print(" mCommitted=");
                printWriter.println(this.d);
                if (!arrayList.isEmpty()) {
                    printWriter.print("  ");
                    printWriter.println("Operations:");
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ta2 ta2Var = (ta2) arrayList.get(i);
                        switch (ta2Var.a) {
                            case 0:
                                str = "NULL";
                                break;
                            case 1:
                                str = "ADD";
                                break;
                            case 2:
                                str = "REPLACE";
                                break;
                            case 3:
                                str = "REMOVE";
                                break;
                            case 4:
                                str = "HIDE";
                                break;
                            case 5:
                                str = "SHOW";
                                break;
                            case 6:
                                str = "DETACH";
                                break;
                            case 7:
                                str = "ATTACH";
                                break;
                            case 8:
                                str = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
                                str = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
                                str = "cmd=" + ta2Var.a;
                                break;
                        }
                        printWriter.print("  ");
                        printWriter.print("  Op #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.print(str);
                        printWriter.print(" ");
                        printWriter.println(ta2Var.b);
                        if (ta2Var.d != 0 || ta2Var.e != 0) {
                            printWriter.print("  ");
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(ta2Var.d));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(ta2Var.e));
                        }
                        if (ta2Var.f != 0 || ta2Var.g != 0) {
                            printWriter.print("  ");
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(ta2Var.f));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(ta2Var.g));
                        }
                    }
                }
                printWriter.close();
            }
            this.d = true;
            this.e = -1;
            if (z) {
                synchronized (ra2Var.c) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                }
                return this.e;
            }
            ra2Var.getClass();
            ze0.m("FragmentManager has not been attached to a host.");
            return 0;
        }
        ze0.m("commit already called");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.e >= 0) {
            sb.append(" #");
            sb.append(this.e);
        }
        sb.append("}");
        return sb.toString();
    }
}

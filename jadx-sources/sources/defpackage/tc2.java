package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class tc2 extends sf0 implements sc2, i73 {
    private final int arity;

    public tc2(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.sf0
    public d73 computeReflected() {
        z05.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tc2) {
            tc2 tc2Var = (tc2) obj;
            if (getName().equals(tc2Var.getName()) && getSignature().equals(tc2Var.getSignature()) && a34.i(getBoundReceiver(), tc2Var.getBoundReceiver()) && a34.i(getOwner(), tc2Var.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof i73)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.sc2
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.sf0
    public i73 getReflected() {
        d73 compute = compute();
        if (compute != this) {
            return (i73) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.i73
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.i73
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.i73
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.i73
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.sf0, defpackage.d73
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        d73 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}

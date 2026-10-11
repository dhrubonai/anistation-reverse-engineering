package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class zv4 extends sf0 implements w73 {
    private final boolean syntheticJavaProperty;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zv4(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.syntheticJavaProperty = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv4.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.sf0
    public d73 compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zv4) {
            zv4 zv4Var = (zv4) obj;
            if (getOwner().equals(zv4Var.getOwner()) && getName().equals(zv4Var.getName()) && getSignature().equals(zv4Var.getSignature()) && a34.i(getBoundReceiver(), zv4Var.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof w73)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // defpackage.sf0
    public w73 getReflected() {
        if (!this.syntheticJavaProperty) {
            d73 compute = compute();
            if (compute != this) {
                return (w73) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ov3.g("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.w73
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.w73
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        d73 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}

package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hi2 {
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public d70 F;
    public int G;
    public final yg0 a;
    public final xg0 b;
    public final RenderNode c;
    public long d;
    public Paint e;
    public Matrix f;
    public boolean g;
    public float h;
    public int i;
    public w60 j;
    public long k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public hi2() {
        yg0 yg0Var = new yg0();
        xg0 xg0Var = new xg0();
        this.a = yg0Var;
        this.b = xg0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.k = 9205357640488583168L;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = ep0.b;
        this.q = j;
        this.r = j;
        this.v = 8.0f;
        this.G = 0;
    }

    public final void a() {
        boolean z;
        boolean z2 = this.w;
        boolean z3 = false;
        if (z2 && !this.g) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.g) {
            z3 = true;
        }
        boolean z4 = this.B;
        RenderNode renderNode = this.c;
        if (z != z4) {
            this.B = z;
            renderNode.setClipToBounds(z);
        }
        if (z3 != this.C) {
            this.C = z3;
            renderNode.setClipToOutline(z3);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.e);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.e;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        int i = this.G;
        RenderNode renderNode = this.c;
        if (i != 1 && this.i == 3 && this.j == null && this.F == null) {
            b(renderNode, i);
        } else {
            b(renderNode, 1);
        }
    }

    public final void d() {
        long j = this.k;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.c;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.d >> 32)) / 2.0f) + this.x);
            renderNode.setPivotY((Float.intBitsToFloat((int) (this.d & 4294967295L)) / 2.0f) + this.y);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.x);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.k & 4294967295L)) + this.y);
        }
    }

    public final void e() {
        int i = this.D;
        this.c.setPosition(i - this.x, this.E - this.y, i + ((int) Float.intBitsToFloat((int) (this.d >> 32))) + this.z, this.E + ((int) Float.intBitsToFloat((int) (this.d & 4294967295L))) + this.A);
    }
}

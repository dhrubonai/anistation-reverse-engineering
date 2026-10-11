package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jt3 {
    public final /* synthetic */ byte a;
    public final Object b;
    public WeakReference c;
    public final MediaSession.Callback d;
    public Handler e;

    public jt3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new Object();
                this.d = new it3(this, (byte) 1);
                this.c = new WeakReference(null);
                return;
            default:
                this.b = new Object();
                this.d = new it3(this, (byte) 0);
                this.c = new WeakReference(null);
                return;
        }
    }

    public void E() {
        byte b = this.a;
    }

    public void H() {
        byte b = this.a;
    }

    public boolean g(Intent intent) {
        switch (this.a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public void h() {
        byte b = this.a;
    }

    public void k() {
        byte b = this.a;
    }

    public void w(long j) {
        byte b = this.a;
    }

    private void F() {
    }

    private void G() {
    }

    private void I() {
    }

    private void J() {
    }

    private void i() {
    }

    private void j() {
    }

    private void l() {
    }

    private void m() {
    }

    public void L() {
    }

    public void f() {
    }

    public void q() {
    }

    public void v() {
    }

    private void x(long j) {
    }

    private void y(long j) {
    }

    public void A(ay4 ay4Var) {
    }

    public void B(ay4 ay4Var) {
    }

    public void C(int i) {
    }

    public void D(int i) {
    }

    public void K(long j) {
    }

    public void a(jq3 jq3Var) {
    }

    public void d(String str) {
    }

    public void u(jq3 jq3Var) {
    }

    public void z(float f) {
    }

    public void b(jq3 jq3Var, int i) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(String str, Bundle bundle) {
    }

    public void t(Uri uri, Bundle bundle) {
    }

    public void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}

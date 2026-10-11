package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qm6 extends i30 {
    public final byte[] B;
    public final DatagramPacket C;
    public Uri D;
    public DatagramSocket E;
    public MulticastSocket F;
    public InetAddress G;
    public boolean H;
    public int I;

    public qm6() {
        super(true);
        byte[] bArr = new byte[2000];
        this.B = bArr;
        this.C = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.q41
    public final void close() {
        this.D = null;
        MulticastSocket multicastSocket = this.F;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.G;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.F = null;
        }
        DatagramSocket datagramSocket = this.E;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.E = null;
        }
        this.G = null;
        this.I = 0;
        if (this.H) {
            this.H = false;
            b();
        }
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        DatagramSocket datagramSocket;
        Uri uri = v41Var.a;
        this.D = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.D.getPort();
        c();
        try {
            this.G = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.G, port);
            if (this.G.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.F = multicastSocket;
                multicastSocket.joinGroup(this.G);
                datagramSocket = this.F;
                this.E = datagramSocket;
            } else {
                DatagramSocket datagramSocket2 = new DatagramSocket(inetSocketAddress);
                this.E = datagramSocket2;
                datagramSocket = datagramSocket2;
            }
            datagramSocket.setSoTimeout(8000);
            this.H = true;
            d(v41Var);
            return -1L;
        } catch (IOException e) {
            throw new s41(e, 2001);
        } catch (SecurityException e2) {
            throw new s41(e2, 2006);
        }
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.I;
        DatagramPacket datagramPacket = this.C;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.E;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.I = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new s41(e, 2002);
            } catch (IOException e2) {
                throw new s41(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.I;
        int min = Math.min(i4, i2);
        System.arraycopy(this.B, length2 - i4, bArr, i, min);
        this.I -= min;
        return min;
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.D;
    }
}

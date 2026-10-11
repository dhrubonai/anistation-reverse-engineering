.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/v;


# instance fields
.field public final a:Lp1/c;

.field public final b:Lp1/d;

.field public final c:Lj6/e;

.field public final d:Lj1/l;

.field public final e:Lj6/e;

.field public final f:Landroidx/fragment/app/g;

.field public final g:Landroidx/lifecycle/q0;

.field public final h:Z

.field public final i:I

.field public final j:J


# direct methods
.method public constructor <init>(Lh1/g;)V
    .locals 2

    .line 1
    new-instance v0, Lp1/c;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lp1/c;-><init>(Lh1/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lp1/c;

    .line 10
    .line 11
    new-instance p1, Landroidx/fragment/app/g;

    .line 12
    .line 13
    invoke-direct {p1}, Landroidx/fragment/app/g;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Landroidx/fragment/app/g;

    .line 17
    .line 18
    new-instance p1, Lj6/e;

    .line 19
    .line 20
    const/16 v0, 0x1a

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lj6/e;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lj6/e;

    .line 26
    .line 27
    sget-object p1, Lq1/c;->F:Lj1/l;

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Lj1/l;

    .line 30
    .line 31
    sget-object p1, Lp1/k;->a:Lp1/d;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lp1/d;

    .line 34
    .line 35
    new-instance p1, Landroidx/lifecycle/q0;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {p1, v0}, Landroidx/lifecycle/q0;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:Landroidx/lifecycle/q0;

    .line 42
    .line 43
    new-instance p1, Lj6/e;

    .line 44
    .line 45
    const/16 v0, 0x1d

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lj6/e;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lj6/e;

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:I

    .line 54
    .line 55
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:J

    .line 61
    .line 62
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Z

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Lc1/k0;)Lp1/o;
    .locals 14

    .line 1
    iget-object v0, p1, Lc1/k0;->b:Lc1/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->c:Lj6/e;

    .line 7
    .line 8
    iget-object v0, v0, Lc1/f0;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Landroidx/appcompat/widget/a0;

    .line 17
    .line 18
    const/16 v3, 0xc

    .line 19
    .line 20
    invoke-direct {v2, v3, v1, v0}, Landroidx/appcompat/widget/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v1, v2

    .line 24
    :cond_0
    new-instance v0, Lp1/o;

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lp1/c;

    .line 27
    .line 28
    iget-object v5, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->b:Lp1/d;

    .line 29
    .line 30
    iget-object v6, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->e:Lj6/e;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->f:Landroidx/fragment/app/g;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Landroidx/fragment/app/g;->b(Lc1/k0;)Lo1/q;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iget-object v8, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->g:Landroidx/lifecycle/q0;

    .line 39
    .line 40
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d:Lj1/l;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v9, Lq1/c;

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->a:Lp1/c;

    .line 48
    .line 49
    invoke-direct {v9, v2, v8, v1}, Lq1/c;-><init>(Lp1/c;Landroidx/lifecycle/q0;Lq1/p;)V

    .line 50
    .line 51
    .line 52
    iget-wide v10, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->j:J

    .line 53
    .line 54
    iget-boolean v12, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->h:Z

    .line 55
    .line 56
    iget v13, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->i:I

    .line 57
    .line 58
    move-object v2, v0

    .line 59
    move-object v3, p1

    .line 60
    invoke-direct/range {v2 .. v13}, Lp1/o;-><init>(Lc1/k0;Lp1/c;Lp1/d;Lj6/e;Lo1/q;Landroidx/lifecycle/q0;Lq1/c;JZI)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method

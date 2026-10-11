.class public final Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/m1;

.field public final synthetic b:Landroidx/fragment/app/m1;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m1;Landroidx/fragment/app/m1;ZLn/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/h;->a:Landroidx/fragment/app/m1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/h;->b:Landroidx/fragment/app/m1;

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/fragment/app/h;->c:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->a:Landroidx/fragment/app/m1;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/h;->b:Landroidx/fragment/app/m1;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 8
    .line 9
    sget-object v2, Landroidx/fragment/app/b1;->a:Landroidx/fragment/app/g1;

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/fragment/app/h;->c:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
.end method

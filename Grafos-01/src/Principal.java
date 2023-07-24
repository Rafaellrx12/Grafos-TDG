import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) {
        //Grafo grafo = new Grafo(false,true);
        //Grafo grafo = new Grafo(true,false);

/*



        Vertice v1=  new Vertice("1");
        Vertice v2=  new Vertice("2");
        Vertice v3=  new Vertice("3");
        Vertice v4=  new Vertice("4");
        Vertice v5=  new Vertice("5");
        Vertice v6=  new Vertice("6");
        Vertice v7=  new Vertice("7");


        grafo.addVertice(v1);
        grafo.addVertice(v2);
        grafo.addVertice(v3);
        grafo.addVertice(v4);
        grafo.addVertice(v5);
        grafo.addVertice(v6);
        grafo.addVertice(v7);

        Aresta v1v2 = new Aresta(v1,v2,"v1-v2");
        Aresta v2v3 = new Aresta(v2,v3,"v2-v3");
        Aresta v2v4 = new Aresta(v2,v4,"v2-v4");
        Aresta v3v1 = new Aresta(v3,v1,"v3-v1");
        Aresta v4v1 = new Aresta(v4,v1,"v4-v1");
        Aresta v4v3 = new Aresta(v4,v3,"v4-v3");
        Aresta v5v6 = new Aresta(v5,v6,"v5-v6");
        Aresta v5v7 = new Aresta(v5,v7,"v5-v7");
        Aresta v6v2 = new Aresta(v6,v2,"v6-v2");
        Aresta v7v4 = new Aresta(v7,v4,"v7-v4");
        Aresta v7v6 = new Aresta(v7,v6,"v7-v6");

        grafo.addAresta(v1v2);
        grafo.addAresta(v2v3);
        grafo.addAresta(v2v4);
        grafo.addAresta(v3v1);
        grafo.addAresta(v4v1);
        grafo.addAresta(v4v3);
        grafo.addAresta(v5v6);
        grafo.addAresta(v5v7);
        grafo.addAresta(v6v2);
        grafo.addAresta(v7v4);
        grafo.addAresta(v7v6);

*/

/*


        Vertice rr=  new Vertice("rr");
        Vertice am=  new Vertice("am");
        Vertice ac=  new Vertice("ac");
        Vertice ro=  new Vertice("ro");
        Vertice pa=  new Vertice("pa");
        Vertice ap=  new Vertice("ap");
        Vertice to=  new Vertice("to");
        Vertice mt=  new Vertice("mt");
        Vertice go=  new Vertice("go");
        Vertice ms=  new Vertice("ms");
        Vertice mg=  new Vertice("mg");
        Vertice es=  new Vertice("es");
        Vertice rj=  new Vertice("rj");
        Vertice sp=  new Vertice("sp");
        Vertice pr=  new Vertice("pr");
        Vertice sc=  new Vertice("sc");
        Vertice rs=  new Vertice("rs");
        Vertice ma=  new Vertice("ma");
        Vertice pi=  new Vertice("pi");
        Vertice ce=  new Vertice("ce");
        Vertice ba=  new Vertice("ba");
        Vertice rn=  new Vertice("rn");
        Vertice pb=  new Vertice("pb");
        Vertice pe=  new Vertice("pe");
        Vertice se=  new Vertice("se");
        Vertice al =  new Vertice("al");
        Vertice df =  new Vertice("df");

        grafo.addVertice(rr);
        grafo.addVertice(am);
        grafo.addVertice(ac);
        grafo.addVertice(ro);
        grafo.addVertice(pa);
        grafo.addVertice(ap);
        grafo.addVertice(to);
        grafo.addVertice(mt);
        grafo.addVertice(go);
        grafo.addVertice(ms);
        grafo.addVertice(mg);
        grafo.addVertice(es);
        grafo.addVertice(rj);
        grafo.addVertice(sp);
        grafo.addVertice(pr);
        grafo.addVertice(sc);
        grafo.addVertice(rs);
        grafo.addVertice(ma);
        grafo.addVertice(pi);
        grafo.addVertice(ce);
        grafo.addVertice(ba);
        grafo.addVertice(rn);
        grafo.addVertice(pb);
        grafo.addVertice(pe);
        grafo.addVertice(se);
        grafo.addVertice(al);
        grafo.addVertice(df);



        Aresta ac1 = new Aresta(ac,am,"ac1",10);
        Aresta ac2 = new Aresta(ac,ro,"ac2",5);
        Aresta am1 = new Aresta(am,ro,"am1",14);
        Aresta am2 = new Aresta(am,rr,"am2",13);
        Aresta am3 = new Aresta(am,ac,"am3",44);
        Aresta ro1 = new Aresta(ro,am,"ro1",33);
        Aresta ro2 = new Aresta(ro,ac,"ro2",22);
        Aresta ro3 = new Aresta(ro,mt,"ro3",24);
        Aresta rr1 = new Aresta(rr,pa,"rr1",25);
        Aresta rr2 = new Aresta(rr,am,"rr2",26);
        Aresta ap1 = new Aresta(ap,pa,"ap1",27);
        Aresta pa1 = new Aresta(pa,rr,"pa1",28);
        Aresta pa2 = new Aresta(pa,am,"pa2",34);
        Aresta pa3 = new Aresta(pa,mt,"pa3",35);
        Aresta pa4 = new Aresta(pa,ap,"pa4",56);
        Aresta pa5 = new Aresta(pa,ma,"pa5",57);
        Aresta pa6 = new Aresta(pa,to,"pa6",78);
        Aresta to1 = new Aresta(to,go,"to1",74);
        Aresta to2 = new Aresta(to,ba,"to2",89);
        Aresta to3 = new Aresta(to,pi,"to3",98);
        Aresta to4 = new Aresta(to,ma,"to4",110);
        Aresta to5 = new Aresta(to,pa,"to5",78);
        Aresta to6 = new Aresta(to,mt,"to6",111);

        Aresta rn1 = new Aresta(rn, pb, "rn1", 320);
        Aresta rn2 = new Aresta(rn, ce, "rn2", 600);
        Aresta pb1 = new Aresta(pb, ce, "pb1", 120);
        Aresta pb2 = new Aresta(pb, pe, "pb2", 240);
        Aresta pe1 = new Aresta(pe, al, "pe1", 270);
        Aresta pe2 = new Aresta(pe, ba, "pe2", 850);
        Aresta pe3 = new Aresta(pe, pi, "pe3", 780);
        Aresta pe4 = new Aresta(pe, ce, "pe4", 630);
        Aresta ce1 = new Aresta(ce, pi, "ce1", 170);
        Aresta ma1 = new Aresta(ma, pi, "ma1", 450);
        Aresta al1 = new Aresta(al, se, "al1", 220);
        Aresta al2 = new Aresta(al, ba, "al2", 330);
        Aresta ba1 = new Aresta(ba, se, "ba1", 280);
        Aresta ba2 = new Aresta(ba, pi, "ba2", 960);
        Aresta pb3 = new Aresta(pb, rn, "pb3", 320);
        Aresta ce2 = new Aresta(ce, rn, "ce2", 600);
        Aresta ce3 = new Aresta(ce, pb, "ce3", 120);
        Aresta pe5 = new Aresta(pe, pb, "pe5", 240);
        Aresta al3 = new Aresta(al, pe, "al3", 270);
        Aresta ba3 = new Aresta(ba, pe, "ba3", 850);
        Aresta pi1 = new Aresta(pi, pe, "pi1", 780);
        Aresta ce4 = new Aresta(ce, pe, "ce4", 630);
        Aresta pi2 = new Aresta(pi, ce, "pi2", 170);
        Aresta pi3 = new Aresta(pi, ma, "pi3", 320);
        Aresta se1 = new Aresta(se, al, "se1", 220);
        Aresta ba4 = new Aresta(ba, al, "ba4", 330);
        Aresta se2 = new Aresta(se, ba, "se2", 280);
        Aresta pi4 = new Aresta(pi, ba, "pi4", 960);


        Aresta mt1 = new Aresta(mt, ro, "mt1", 2050);
        Aresta mt2 = new Aresta(mt, am, "mt2", 2325);
        Aresta mt3 = new Aresta(mt, pa, "mt3", 1717);
        Aresta mt4 = new Aresta(mt, to, "mt4", 1390);
        Aresta mt5 = new Aresta(mt, go, "mt5", 934);
        Aresta mt6 = new Aresta(mt, ms, "mt6", 1392);
        Aresta go1 = new Aresta(go, mt, "go1", 934);
        Aresta go2 = new Aresta(go, to, "go2", 924);
        Aresta go3 = new Aresta(go, ba, "go3", 926);
        Aresta go4 = new Aresta(go, df, "go4", 209);
        Aresta go5 = new Aresta(go, ms, "go5", 720);
        Aresta ms1 = new Aresta(ms, go, "ms1", 720);
        Aresta ms2 = new Aresta(ms, mt, "ms2", 1392);
        Aresta ms3 = new Aresta(ms, mg, "ms3", 844);
        Aresta ms4 = new Aresta(ms, sp, "ms4", 1032);
        Aresta ms5 = new Aresta(ms, pr, "ms5", 973);
        Aresta mg1 = new Aresta(mg, es, "mg1", 535);
        Aresta mg2 = new Aresta(mg,rj,"mg2",434);
        Aresta mg3 = new Aresta(mg,ba,"mg3",904);
        Aresta mg4 = new Aresta(mg,go,"mg4",584);
        Aresta mg5 = new Aresta(mg,ms,"mg5",933);
        Aresta mg6 = new Aresta(mg,sp,"mg6",586);
        Aresta es1 = new Aresta(es,mg,"es1",521);
        Aresta es2 = new Aresta(es,rj,"es2",415);
        Aresta es3 = new Aresta(es,ba,"es3",1145);
        Aresta rj1 = new Aresta(rj,es,"rj1",415);
        Aresta rj2 = new Aresta(rj,mg,"rj2",434);
        Aresta rj3 = new Aresta(rj,sp,"rj3",354);
        Aresta sp1 = new Aresta(sp,mg,"sp1",586);
        Aresta sp2 = new Aresta(sp,rj,"sp2",354);
        Aresta sp3 = new Aresta(sp,ms,"sp3",1016);
        Aresta sp4 = new Aresta(sp,pr,"sp4",408);
        Aresta pr1 = new Aresta(pr,sp,"pr1",408);
        Aresta pr2 = new Aresta(pr,ms,"pr2",975);
        Aresta pr3 = new Aresta(pr,sc,"pr3",707);
        Aresta sc1 = new Aresta(sc,pr,"sc1",707);
        Aresta sc2 = new Aresta(sc,rs,"sc2",576);
        Aresta rs1 = new Aresta(rs,sc,"rs1",576);



        grafo.addAresta(ac1);
        grafo.addAresta(ac2);
        grafo.addAresta(am1);
        grafo.addAresta(am2);
        grafo.addAresta(am3);
        grafo.addAresta(ro1);
        grafo.addAresta(ro2);
        grafo.addAresta(ro3);
        grafo.addAresta(rr1);
        grafo.addAresta(rr2);
        grafo.addAresta(ap1);
        grafo.addAresta(pa1);
        grafo.addAresta(pa2);
        grafo.addAresta(pa3);
        grafo.addAresta(pa4);
        grafo.addAresta(pa5);
        grafo.addAresta(pa6);
        grafo.addAresta(to1);
        grafo.addAresta(to2);
        grafo.addAresta(to3);
        grafo.addAresta(to4);
        grafo.addAresta(to5);
        grafo.addAresta(to6);


        grafo.addAresta(rn1);
        grafo.addAresta(rn2);
        grafo.addAresta(pb1);
        grafo.addAresta(pb2);
        grafo.addAresta(pe1);
        grafo.addAresta(pe2);
        grafo.addAresta(pe3);
        grafo.addAresta(pe4);
        grafo.addAresta(ce1);
        grafo.addAresta(ma1);
        grafo.addAresta(al1);
        grafo.addAresta(al2);
        grafo.addAresta(ba1);
        grafo.addAresta(ba2);
        grafo.addAresta(pb3);
        grafo.addAresta(ce2);
        grafo.addAresta(ce3);
        grafo.addAresta(pe5);
        grafo.addAresta(al3);
        grafo.addAresta(ba3);
        grafo.addAresta(pi1);
        grafo.addAresta(ce4);
        grafo.addAresta(pi2);
        grafo.addAresta(pi3);
        grafo.addAresta(se1);
        grafo.addAresta(ba4);
        grafo.addAresta(se2);
        grafo.addAresta(pi4);



        grafo.addAresta(mt1);
        grafo.addAresta(mt2);
        grafo.addAresta(mt3);
        grafo.addAresta(mt4);
        grafo.addAresta(mt5);
        grafo.addAresta(mt6);
        grafo.addAresta(go1);
        grafo.addAresta(go2);
        grafo.addAresta(go3);
        grafo.addAresta(go4);
        grafo.addAresta(go5);
        grafo.addAresta(ms1);
        grafo.addAresta(ms2);
        grafo.addAresta(ms3);
        grafo.addAresta(ms4);
        grafo.addAresta(ms5);
        grafo.addAresta(mg1);
        grafo.addAresta(mg2);
        grafo.addAresta(mg3);
        grafo.addAresta(mg4);
        grafo.addAresta(mg5);
        grafo.addAresta(mg6);
        grafo.addAresta(es1);
        grafo.addAresta(es2);
        grafo.addAresta(es3);
        grafo.addAresta(rj1);
        grafo.addAresta(rj2);
        grafo.addAresta(rj3);
        grafo.addAresta(sp1);
        grafo.addAresta(sp2);
        grafo.addAresta(sp3);
        grafo.addAresta(sp4);
        grafo.addAresta(pr1);
        grafo.addAresta(pr2);
        grafo.addAresta(pr3);
        grafo.addAresta(sc1);
        grafo.addAresta(sc2);
        grafo.addAresta(rs1);
*/
        Grafo grafo = new Grafo(true, true);

        Vertice v1 = new Vertice("1");
        Vertice v2 = new Vertice("2");
        Vertice v3 = new Vertice("3");
        Vertice v4 = new Vertice("4");
        Vertice v5 = new Vertice("5");
        Vertice v6 = new Vertice("6");
        Vertice v7 = new Vertice("7");

        grafo.addVertice(v1);
        grafo.addVertice(v2);
        grafo.addVertice(v3);
        grafo.addVertice(v4);
        grafo.addVertice(v5);
        grafo.addVertice(v6);
        grafo.addVertice(v7);

        Aresta v1v4 = new Aresta(v1, v4, "v1-v4", 1);
        Aresta v1v2 = new Aresta(v1, v2, "v1-v2", 2);
        Aresta v2v4 = new Aresta(v2, v4, "v2-v4", 3);
        Aresta v2v5 = new Aresta(v2, v5, "v2-v5", 10);
        Aresta v3v1 = new Aresta(v3, v1, "v3-v1", 4);
        Aresta v3v6 = new Aresta(v3, v6, "v3-v6", 5);
        Aresta v4v3 = new Aresta(v4, v3, "v4-v3", 2);
        Aresta v4v6 = new Aresta(v4, v6, "v4-v6", 8);
        Aresta v4v7 = new Aresta(v4, v7, "v4-v7", 4);
        Aresta v4v5 = new Aresta(v4, v5, "v4-v5", 2);
        Aresta v5v7 = new Aresta(v5, v7, "v5-v7", 6);
        Aresta v7v6 = new Aresta(v7, v6, "v7-v6", 1);

        grafo.addAresta(v1v4);
        grafo.addAresta(v1v2);
        grafo.addAresta(v2v4);
        grafo.addAresta(v2v5);
        grafo.addAresta(v3v1);
        grafo.addAresta(v3v6);
        grafo.addAresta(v4v3);
        grafo.addAresta(v4v6);
        grafo.addAresta(v4v7);
        grafo.addAresta(v4v5);
        grafo.addAresta(v5v7);
        grafo.addAresta(v7v6);

        System.out.println(grafo.dijkstra(v3, v5));











        //System.out.println(grafo.toString());
        //System.out.println(grafo.isDigrafo());
        //System.out.println(grafo.getOrdem());
        //System.out.println(grafo.getTamanho());
        //System.out.println(grafo.grauVertice(u));
        //System.out.println(grafo.getOrdem());
        //grafo.incidencia1();
        //grafo.adjacenciaMatriz();
        //grafo.getTamanho();
        //grafo.getOrdem();
        //System.out.println(grafo.buscaEmProfundidade());
        //System.out.println(grafo.buscaEmLargura(am,ms));
    }
}
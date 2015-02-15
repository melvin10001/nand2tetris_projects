class Assembler
{
    public static void assemble(String infile, String outfile)
    {
        Parser p = new Parser(infile);
        SymbolTable st = new SymbolTable();
        
        // Insert code here
    }

    public static void main(String[] args)
    {
        if(args.length!=1)
        {
            System.err.println("Usage: java Assembler infile.asm");
            System.exit(0);
        }
        
        String infile = args[0];
        int dot = infile.lastIndexOf('.');
        String outfile = ((dot == -1) ? infile : infile.substring(0, dot) ) + ".hack";
        assemble(infile, outfile);
    }
}

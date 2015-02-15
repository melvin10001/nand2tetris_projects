/*
 *A symbol table that keeps a correspondence between
        symbolic labels and numeric addresses
 */
class SymbolTable
{

    /*
     * Creates the initial symbol table
     */
    public SymbolTable()
    {
    }
    
    /*
     *Adds the pair (symbol, address) to the table.
     */ 
    public void addEntry(String symbol, int address)
    {
    }
    
    /*
     * Adds the symbol to the table, setting the address
     *  to the next availble memory location 
     */
    public void addEntry(String symbol)
    {
    }

    /*
     * Does the symbol table contain the given symbol?
     */
    public boolean contains(String symbol)
    {
        return false;
    }

    /*
     * Returns the integer address associated with the symbol
     */
    public int getAddress(String symbol)
    {
        return -1;
    }
}
